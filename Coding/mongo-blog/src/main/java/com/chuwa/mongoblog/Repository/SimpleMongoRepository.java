package com.chuwa.mongoblog.Repository;

import com.chuwa.mongoblog.model.Blog;
import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.TransactionOptions;
import com.mongodb.WriteConcern;
import com.mongodb.client.ClientSession;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReplaceOneModel;
import com.mongodb.client.model.WriteModel;
import org.bson.BsonDocument;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.in;
import static com.mongodb.client.model.ReturnDocument.AFTER;

public class SimpleMongoRepository implements BlogRepository {
    private static final TransactionOptions txnOptions = TransactionOptions.builder()
            .readPreference(ReadPreference.primary())
            .readConcern(ReadConcern.MAJORITY)
            .writeConcern(WriteConcern.MAJORITY)
            .build();

    private final MongoClient client;

    private MongoCollection<Blog> blogCollection;

    public SimpleMongoRepository(MongoClient mongoClient) {
        this.client = mongoClient;
    }

    void init() {
        blogCollection = client.getDatabase("blogs").getCollection("blog", Blog.class);
    }

    @Override
    public Blog save(Blog blog) {
        blog.setId(new ObjectId());
        blogCollection.insertOne(blog);
        return blog;
    }

    @Override
    public List<Blog> saveAll(List<Blog> blogs) {
        try (ClientSession clientSession = client.startSession()) {
            return clientSession.withTransaction(() -> {
                blogs.forEach(p -> p.setId(new ObjectId()));
                blogCollection.insertMany(clientSession, blogs);
                return blogs;
            }, txnOptions);
        }
    }

    @Override
    public List<Blog> findAll() {
        return blogCollection.find().into(new ArrayList<>());
    }

    @Override
    public List<Blog> findAll(List<String> ids) {
        return blogCollection.find(in("_id", mapToObjectIds(ids))).into(new ArrayList<>());
    }

    @Override
    public Blog findOne(String id) {
        return blogCollection.find(eq("_id", new ObjectId(id))).first();
    }

    @Override
    public long delete(String id) {
        return blogCollection.deleteOne(eq("_id", new ObjectId(id))).getDeletedCount();
    }

    @Override
    public long delete(List<String> ids) {
        try (ClientSession clientSession = client.startSession()) {
            return clientSession.withTransaction(
                    () -> blogCollection.deleteMany(clientSession, in("_id", mapToObjectIds(ids))).getDeletedCount(),
                    txnOptions);
        }
    }

    @Override
    public long deleteAll() {
        try (ClientSession clientSession = client.startSession()) {
            return clientSession.withTransaction(
                    () -> blogCollection.deleteMany(clientSession, new BsonDocument()).getDeletedCount(), txnOptions);
        }
    }

    @Override
    public Blog update(Blog blog) {
        FindOneAndReplaceOptions options = new FindOneAndReplaceOptions().returnDocument(AFTER);
        return blogCollection.findOneAndReplace(eq("_id", blog.getId()), blog, options);
    }

    @Override
    public long update(List<Blog> blogs) {
        List<WriteModel<Blog>> writes = blogs.stream()
            .map(p -> new ReplaceOneModel<>(eq("_id", p.getId()), p))
            .collect(Collectors.toList());
        try (ClientSession clientSession = client.startSession()) {
            return clientSession.withTransaction(
                    () -> blogCollection.bulkWrite(clientSession, writes).getModifiedCount(), txnOptions);
        }
    }

    public List<ObjectId> mapToObjectIds(List<String> ids) {
        return ids.stream().map(ObjectId :: new).collect(Collectors.toList());
    }
}