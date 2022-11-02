package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payLoad.CommentDto;
import com.chuwa.redbook.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public CommentDto createComment(long postId, CommentDto commentDto){
        Comment comment= mapToEntity(commentDto);
        //retrieve post entity by id
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException("post", "id", postId));
        //set post to comment entity
        comment.setPost(post);
        //comment entity to DB
        Comment  savedComment= commentRepository.save(comment);
        return mapToDto(savedComment);
    }
    @Override
    public List<CommentDto> getComemntsByPostId(long postId){
        //retrieve comments by postId
        List<Comment> comments = commentRepository.findByPostId(postId);
        //convert list of comment entities to list of comment dtos
        return comments.stream().map(comment-> mapToDto(comment)).collect(Collectors.toList());
    };
    @Override
    public CommentDto getCommentById(Long postId, Long commentId){
        // retrieve post entity by id
        Post post= postRepository.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post", "id", postId));
        //retrieve comment by id
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(()-> new ResourceNotFoundException("Comment", "id", commentId));
        //
        if(!comment.getPost().getId().equals(post.getId())){
            throw new BlogAPIException(HttpStatus.BAD_GATEWAY, "Comment does not belong to post");
        }
        return mapToDto(comment);

    };
    @Override
    public CommentDto updateComment(Long postId, Long commentId, CommentDto commentDtoRequest){
        //retrieve post entity by id
        Post post= postRepository.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post","id", postId));

        //retrieve comment by id
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(()-> new ResourceNotFoundException("Comment", "id", commentId));
        //
        if(!comment.getPost().getId().equals(post.getId())){
            throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
        }
        comment.setName(commentDtoRequest.getName());
        comment.setEmail(commentDtoRequest.getEmail());
        comment.setBody(commentDtoRequest.getBody());

        Comment updateComment= commentRepository.save(comment);

        return mapToDto(updateComment);
    };
    @Override
    public void deleteComment(Long postId, Long commentId){
        //retrieve post entity by id
        Post post= postRepository.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post","id", postId));
        //retrieve comment by id
        Comment comment= commentRepository.findById(commentId)
                .orElseThrow(()-> new ResourceNotFoundException("Comment","id", commentId));
        if(!comment.getPost().getId().equals(post.getId())){
            throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
        }

        commentRepository.delete(comment);

    };

    private CommentDto mapToDto(Comment comment){
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setName(comment.getName());
        commentDto.setEmail(comment.getEmail());
        commentDto.setBody(comment.getBody());
        return commentDto;
    }

    private Comment mapToEntity(CommentDto commentDto){
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setBody(commentDto.getBody());

        return comment;
    }
}
