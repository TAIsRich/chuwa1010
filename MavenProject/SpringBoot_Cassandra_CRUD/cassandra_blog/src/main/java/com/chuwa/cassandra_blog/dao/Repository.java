package com.chuwa.cassandra_blog.dao;

import com.chuwa.cassandra_blog.entity.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;
public interface Repository extends CassandraRepository<Post, UUID> {
}
