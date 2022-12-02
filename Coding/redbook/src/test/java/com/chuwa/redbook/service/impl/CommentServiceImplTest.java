package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.CommentRepository;
import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Comment;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.BlogAPIException;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.CommentDto;
import com.chuwa.redbook.payload.PostDto;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CommentServiceImplTest {
    private static final Logger logger = LoggerFactory.getLogger(CommentServiceImplTest.class);

    @Mock
    private CommentRepository commentRepositoryMock;

    @Mock
    private PostRepository postRepositoryMock;

    @Spy
    private ModelMapper modelMapper;

    @InjectMocks
    private CommentServiceImpl commentService;

    private CommentDto commentDto;
    private Comment comment;
    private PostDto postDto;
    private Post post;

    @BeforeAll
    static void beforeAll() {logger.info("START test");}

    @BeforeEach
    void setUp() {
        logger.info("set up Post for each test");

        this.comment = new Comment(1L, "test_user", "test@t.com", "testing content here",
                LocalDateTime.now(), LocalDateTime.now());
        this.post = new Post(1L, "Good Restaurant", "This is the best dinner", "Yummy",
                LocalDateTime.now(), LocalDateTime.now());
        ModelMapper modelMapper = new ModelMapper();
        this.postDto = modelMapper.map(this.post, PostDto.class);
        this.commentDto = modelMapper.map(this.comment, CommentDto.class);

        this.comment.setPost(this.post);
    }

    @Test
    public void testCreateComment() {
        long postId = 1L;

        // define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(comment);

        // execute
        CommentDto commentResponse = commentService.createComment(postId, commentDto);

        // assertions
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());

        Assertions.assertEquals(postDto.getId(), commentResponse.getId());
    }

    @Test
    public void testCreateComment_ResourceNotFoundException() {
        //define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Post", "id", 1L));
        //execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> commentService.createComment(1L, commentDto));

    }

    @Test
    public void testGetCommentByPostId() {
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);

        //define behaviors
        Mockito.when(commentRepositoryMock.findByPostId(ArgumentMatchers.anyLong()))
                .thenReturn(comments);
        //execute
        List<CommentDto> commentDtos = commentService.getCommentByPostId(1L);
        //assertions
        Assertions.assertNotNull(commentDtos);
        Assertions.assertEquals(1, commentDtos.size());
        CommentDto commentResponse = commentDtos.get(0);
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());

    }

    @Test
    public void testGetCommentById() {

        //define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        // execute
        CommentDto commentResponse = commentService.getCommentById(1L, 1L);

        // assertions
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());

    }

    @Test
    public void testGetCommentById_ResourceNotFoundException1() {

        //define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Post", "id", 1L));
        //execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, ()->commentService.getCommentById(1L, 1L));

    }

    @Test
    public void testGetCommentById_ResourceNotFoundException2() {

        //define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Comment", "id", 1L));
        //execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, ()->commentService.getCommentById(1L, 1L));

    }

    @Test
    public void testGetCommentById_BlogAPIException() {
        // create another post
        Post post2 = new Post(2L, "empty", "empty", "empty", null, null);

        //define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post2));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));

        //execute and assertions
        Assertions.assertThrows(BlogAPIException.class, ()->commentService.getCommentById(2L, 1L));
    }

    @Test
    public void testUpdateComment() {
        // create an updated body, and update in to our mock commentDto
        String body = "UPDATED - " + comment.getBody();
        commentDto.setBody(body);

        Comment updatedComment = new Comment();
        updatedComment.setId(comment.getId());
        updatedComment.setName(comment.getName());
        updatedComment.setEmail(comment.getEmail());
        updatedComment.setBody(body);

        // define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.when(commentRepositoryMock.save(ArgumentMatchers.any(Comment.class)))
                .thenReturn(updatedComment);

        // execute
        CommentDto commentResponse = commentService.updateComment(1L, 1L, commentDto);

        //Assertions
        Assertions.assertNotNull(commentResponse);
        Assertions.assertEquals(commentDto.getName(), commentResponse.getName());
        Assertions.assertEquals(commentDto.getEmail(), commentResponse.getEmail());
        Assertions.assertEquals(commentDto.getBody(), commentResponse.getBody());
    }

    @Test
    public void testUpdateComment_ResourceNotFoundException1() {

        // define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Post", "id", 1L));

        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> commentService.updateComment(1L, 1L, commentDto));

    }

    @Test
    public void testUpdateComment_ResourceNotFoundException2() {
        // define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Comment", "id", 1L));

        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> commentService.updateComment(1L, 1L, commentDto));

    }

    @Test
    public void testUpdateComment_BlogAPIException() {
        // create another post
        Post post2 = new Post(2L, "empty", "empty", "empty", null, null);

        // update the commentDto
        String body = "UPDATED - " + comment.getBody();
        commentDto.setBody(body);

        //define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post2));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        //execute and assertions
        Assertions.assertThrows(BlogAPIException.class, ()->commentService.updateComment(1L, 1L, commentDto));
    }

    @Test
    void testDeleteComment() {
        // define the behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        Mockito.doNothing().when(commentRepositoryMock).delete(ArgumentMatchers.any(Comment.class));

        //execute
        commentService.deleteComment(1L, 1L);

        //verify
        Mockito.verify(commentRepositoryMock, Mockito.times(1)).delete(ArgumentMatchers.any(Comment.class));
    }

    @Test
    public void testDeleteComment_ResourceNotFoundException1() {

        // define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Post", "id", 1L));

        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> commentService.deleteComment(1L, 1L));

    }

    @Test
    public void testDeleteComment_ResourceNotFoundException2() {
        // define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Comment", "id", 1L));

        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> commentService.deleteComment(1L, 1L));

    }

    @Test
    public void testDeleteComment_BlogAPIException() {
        // create another post
        Post post2 = new Post(2L, "empty", "empty", "empty", null, null);

        //define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post2));
        Mockito.when(commentRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(comment));
        //execute and assertions
        Assertions.assertThrows(BlogAPIException.class, ()->commentService.deleteComment(1L, 1L));
    }

    @AfterAll
    static void afterAll() {
        logger.info("Ending Test");
    }

}