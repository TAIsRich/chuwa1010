package com.chuwa.rebook.controller;

import com.chuwa.rebook.payload.CommentDto;
import com.chuwa.rebook.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(
            @PathVariable(value ="postId") long id,
            @RequestBody CommentDto commentDto
    ){
        return new ResponseEntity<>(commentService.createComment(id,commentDto), HttpStatus.CREATED);
    }

    @GetMapping("/posts/{postId}/comments")
    public List<CommentDto> GetCommentByPostId(@PathVariable(value  ="postId") long id){
        return commentService.getCommentsByPostId(id);
    }
    @GetMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> getCommentsById(
            @PathVariable(value = "postId") long postId,
            @PathVariable(value = "commentId") long commentId){
        CommentDto commentDto = commentService.getCommentById(postId,commentId);
        return new ResponseEntity<>(commentDto,HttpStatus.OK);
    }
    @PutMapping("/posts/{postId}/comments/{coometId}")
    public ResponseEntity<CommentDto> updateComment(
            @PathVariable(value = "postId") long postId,
            @PathVariable(value = "commentId") long commentId,
            @RequestBody CommentDto commentDto){
        CommentDto update = commentService.updateComment(postId,commentId,commentDto);
        return  new ResponseEntity<>(update,HttpStatus.OK);
    }
    @DeleteMapping("/posts/{postId}/comments/{coometId}")
    public ResponseEntity<String> updateComment(
            @PathVariable(value = "postId") long postId,
            @PathVariable(value = "commentId") long commentId){
        commentService.deleteComment(postId,commentId);
        return new ResponseEntity<>("Comment deleted Successfully", HttpStatus.OK);
    }
}
