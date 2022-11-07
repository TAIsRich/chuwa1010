package com.chuwa.rebook.service.impl;

import com.chuwa.rebook.dao.CommentRepository;
import com.chuwa.rebook.dao.PostRepository;
import com.chuwa.rebook.entity.Comment;
import com.chuwa.rebook.entity.Post;
import com.chuwa.rebook.exception.BlogAPIException;
import com.chuwa.rebook.exception.ResourceNotFoundException;
import com.chuwa.rebook.payload.CommentDto;
import com.chuwa.rebook.service.CommentService;
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
    public CommentDto createComment(long postId, CommentDto commentDto) {
        Comment comment = mapToEntity(commentDto);

        Post post = postRepository
                .findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post","id",postId));
        comment.setPost(post);
        Comment savedComment = commentRepository.save(comment);
        return mapToDto(comment);
    }

    @Override
    public List<CommentDto> getCommentsByPostId(long postId) {
        List<Comment> comments = commentRepository.findByPostId(postId);

        return comments.stream().map(comment -> mapToDto(comment)).collect(Collectors.toList());
    }

    @Override
    public CommentDto getCommentById(Long postId, Long commentId) {
        Post post = postRepository
                .findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post","id",postId));
        Comment comment = commentRepository
                .findById(commentId)
                .orElseThrow(() -> new ResourceNotFoundException("Comment","id",commentId));
        if (!(comment.getPost().getId()==post.getId())) {
            throw new BlogAPIException(HttpStatus.BAD_REQUEST, "comment does not blong to this post");
        }
        return mapToDto(comment);
    }

    @Override
    public CommentDto updateComment(Long postId, Long commentId, CommentDto commentDtoRequest) {
        Post post = postRepository
                .findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post","id",postId));
        Comment comment = commentRepository
                .findById(commentId)
                .orElseThrow(() -> new ResourceNotFoundException("Comment","id",commentId));
        if (!(comment.getPost().getId()==post.getId())) {
            throw new BlogAPIException(HttpStatus.BAD_REQUEST, "comment does not blong to this post");
        }
        comment.setName(commentDtoRequest.getName());
        comment.setEmail(commentDtoRequest.getEmail());
        comment.setBody(commentDtoRequest.getBody());
        Comment updatedComment = commentRepository.save(comment);
        return mapToDto(updatedComment);
    }

    @Override
    public void deleteComment(Long postId, Long commentId) {
        Post post = postRepository
                .findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post","id",postId));
        Comment comment = commentRepository
                .findById(commentId)
                .orElseThrow(() -> new ResourceNotFoundException("Comment","id",commentId));
        if (!(comment.getPost().getId()==post.getId())) {
            throw new BlogAPIException(HttpStatus.BAD_REQUEST, "comment does not blong to this post");
        }
        commentRepository.delete(comment);
    }
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
