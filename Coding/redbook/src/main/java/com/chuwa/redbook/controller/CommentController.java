package com.chuwa.redbook.controller;

import com.chuwa.redbook.payLoad.CommentDto;
import com.chuwa.redbook.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentController {
    /**
     * TODO: Questions
     * why intellij give us this warning? constructor injection.
     * how many ways we can do Dependency Injection?
     * which way is the best one?
     */
    //Method 1: field injection
    @Autowired
    private CommentService commentService;

    /*
    * //Method 2: constructor-- the best method
    @Autowired
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }
    //Method 3: setter
    @Autowired
    private CommentService commentService;
    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }
    * */


    //post comments by post id
    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(value="postId") long id,
                                                    @Valid @RequestBody CommentDto commentDto) {
        return new ResponseEntity<>(commentService.createComment(id, commentDto), HttpStatus.CREATED);
    }

    //get comments by post id
    @GetMapping("/posts/{postId}/comments/")
    public List<CommentDto> getCommentsByPostId(@PathVariable(value="postId") Long postId){
        return commentService.getComemntsByPostId(postId);
    }

    //get comments by post id and comment id: {{localhost}}/api/v1/posts/3/comments/1
    //http:localhost:8080/api/v1/posts/3/comments/1
    @GetMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> getCommentsById(
            @PathVariable(value ="postId") Long postId,
            @PathVariable(value="id") Long commentId) {
        CommentDto commentDto = commentService.getCommentById(postId, commentId);
        return new ResponseEntity<>(commentDto, HttpStatus.OK);
    }

    //update comment by post id and comment id
    @PutMapping("/posts/{postId}/comments/{id}")
    //http:{{localhost}}/api/v1/posts/3/comments/1
    public ResponseEntity<CommentDto> updateComment(@PathVariable(value="postId") Long postId,
                                                    @PathVariable(value="id") Long commentId,
                                                    @Valid @RequestBody CommentDto commentDto) {
        CommentDto updateComment= commentService.updateComment(postId, commentId, commentDto);
        return new ResponseEntity<>(updateComment, HttpStatus.OK);
    }

    //delete comment by post id and comment id
    @DeleteMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable(value = "postId") Long postId,
                                                @PathVariable(value= "id") Long commentId){
        commentService.deleteComment(postId, commentId);
        return new ResponseEntity<>("Comment deleted Successfully", HttpStatus.OK);
    }


}
