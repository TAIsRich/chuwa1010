package com.chuwa.redbook.service.impl;

import com.chuwa.redbook.dao.PostRepository;
import com.chuwa.redbook.entity.Post;
import com.chuwa.redbook.exception.ResourceNotFoundException;
import com.chuwa.redbook.payload.PostDto;
import com.chuwa.redbook.payload.PostResponse;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PostServiceImplTest {
    private static final Logger logger = LoggerFactory.getLogger(PostServiceImplTest.class);

    /**
     * 创建一个Mock对象
     * 也可以通过PostRepository postRepository = Mockito.mock(PostRepository.class)
     * 区别是， @Mock这种方式会被@InjectMocks识别，并注入给该变量
     */
    @Mock
    private PostRepository postRepositoryMock;

    /**
     * 未定义的方法（behavior），则调用真实的方法。
     * 已定义的方法when().thenReturn(), 则调用mock的虚假behavior。
     */
    @Spy
    private ModelMapper modelMapper;

    /**
     * 为该class依赖的变量，注入对应的Mock对象。
     * 比如PostServiceImpl依赖postRepository 和modelMapper,则将上面@Mock和@Spy修饰的注入进来
     */
    @InjectMocks
    private PostServiceImpl postService;

    /**
     * 定义两个fields
     */
    private PostDto postDto;
    private Post post;

    // method under @BeforeAll will be called only once, and it happens when we just enter the class
    @BeforeAll
    static void beforeAll() {logger.info("START test");}

    // method under @BeforeEach will be called every time before a test method is called
    // this Annotation is always used for set up for the test method
    @BeforeEach
    void setUp() {
        logger.info("set up Post for each test");

        // create a mock Post, which has id=1,
        this.post = new Post(1L, "Good Restaurant", "This is the best dinner", "Yummy",
                LocalDateTime.now(), LocalDateTime.now());
        ModelMapper modelMapper = new ModelMapper();
        this.postDto = modelMapper.map(this.post, PostDto.class);
    }

    @Test
    public void testCreatePost(){
        // define the behaviors
        Mockito.when(postRepositoryMock.save(ArgumentMatchers.any(Post.class)))
                .thenReturn(post);

        // execute test
        PostDto postResponse = postService.createPost(postDto);

        // assertions
        // we already have a mock postDto when we set up,
        // so we should verify it by checking each entry between postResponse and mock postDto
        Assertions.assertNotNull(postResponse);
        Assertions.assertEquals(postDto.getTitle(), postResponse.getTitle());
        Assertions.assertEquals(postDto.getDescription(), postResponse.getDescription());
        Assertions.assertEquals(postDto.getContent(), postResponse.getContent());

    }

    @Test
    public void testGetAllPosts() {
        // mock a list of post, with only one post in the list
        List<Post> posts = new ArrayList<>();
        posts.add(post);

        // define behaviors
        Mockito.when(postRepositoryMock.findAll())
                .thenReturn(posts);

        // execute
        List<PostDto> postDtos = postService.getAllPosts();

        // assertions
        Assertions.assertNotNull(postDtos);
        Assertions.assertEquals(1, postDtos.size());
        PostDto postResponse = postDtos.get(0);
        Assertions.assertEquals(postDto.getTitle(), postResponse.getTitle());
        Assertions.assertEquals(postDto.getDescription(), postResponse.getDescription());
        Assertions.assertEquals(postDto.getContent(), postResponse.getContent());

    }

    @Test
    public void testGetPostById() {
        // define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        // execute
        PostDto postResponse = postService.getPostById(1L);

        // assertions
        Assertions.assertNotNull(postResponse);
        Assertions.assertEquals(postDto.getTitle(), postResponse.getTitle());
        Assertions.assertEquals(postDto.getDescription(), postResponse.getDescription());
        Assertions.assertEquals(postDto.getContent(), postResponse.getContent());
    }

    @Test
    public void testGetPostById_ResourceNotFoundException() {
        // define the behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Post", "id", 1L));

        //execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> postService.getPostById(1L));
    }

    @Test
    public void testUpdatePost() {
        // create an updated description, and update it to our mock postDto
        String description = "UPDATED - " + post.getDescription();
        postDto.setDescription(description);

        // deep copy of updated post
        Post updatedPost = new Post();
        updatedPost.setId(post.getId());
        updatedPost.setTitle(post.getTitle());
        updatedPost.setContent(post.getContent());
        updatedPost.setDescription(description);

        //define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        Mockito.when(postRepositoryMock.save(ArgumentMatchers.any(Post.class)))
                .thenReturn(updatedPost);

        // execute
        PostDto postResponse = postService.updatePost(postDto, 1L);

        // assertions
        Assertions.assertNotNull(postResponse);
        Assertions.assertEquals(postDto.getTitle(), postResponse.getTitle());
        Assertions.assertEquals(postDto.getDescription(), postResponse.getDescription());
        Assertions.assertEquals(postDto.getContent(), postResponse.getContent());

    }

    @Test
    public void testUpdatedPost_ResourceNotFoundException() {
        // define the behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Post", "id", 1L));

        //execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, ()->postService.updatePost(postDto, 1L));
    }

    @Test
    public void testDeleteById() {
        // define the behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenReturn(Optional.of(post));

        // postRepositoryMock.delete() is a void method, so we use Mockito.doNothing()
        Mockito.doNothing().when(postRepositoryMock).delete(ArgumentMatchers.any(Post.class));

        // execute
        postService.deletePostById(1L);

        // for method that has void return, we can:
        // verify that postRepository.delete() has been called once
        Mockito.verify(postRepositoryMock, Mockito.times(1)).delete(ArgumentMatchers.any(Post.class));

    }

    @Test
    public void testDeletePostById_ResourceNotFoundException() {
        // define behaviors
        Mockito.when(postRepositoryMock.findById(ArgumentMatchers.anyLong()))
                .thenThrow(new ResourceNotFoundException("Post", "id", 1L));

        // execute and assertions
        Assertions.assertThrows(ResourceNotFoundException.class, () -> postService.deletePostById(1L));

    }

    @Test
    public void testGetAllPost_Pageable() {
        int pageNo = 1;
        int pageSize = 5;
        String sortBy = "title";
        String sortDir = Sort.Direction.ASC.name();
        Long totalElements = 22L;
        int totalPages = (int) Math.ceil(totalElements/pageSize);
        boolean isLast = pageNo == totalPages;

        List<Post> posts = new ArrayList<>();
        posts.add(post);

        // define the behaviors
        Page<Post> pagePosts = Mockito.mock(Page.class);
        // mock the built-in method of Page Class
        Mockito.when(pagePosts.getContent()).thenReturn(posts);
        Mockito.when(pagePosts.getNumber()).thenReturn(pageNo);
        Mockito.when(pagePosts.getSize()).thenReturn(pageSize);
        Mockito.when(pagePosts.getTotalElements()).thenReturn(totalElements);
        Mockito.when(pagePosts.getTotalPages()).thenReturn(totalPages);
        Mockito.when(pagePosts.isLast()).thenReturn(isLast);

        Mockito.when(postRepositoryMock.findAll(ArgumentMatchers.any(PageRequest.class)))
                .thenReturn(pagePosts);

        // execute
        PostResponse postResponse = postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);

        // verify
        Assertions.assertNotNull(postResponse);
        Assertions.assertEquals(pageNo, postResponse.getPageNo());
        Assertions.assertEquals(pageSize, postResponse.getPageSize());
        Assertions.assertEquals(totalElements, postResponse.getTotalElements());
        Assertions.assertEquals(totalPages, postResponse.getTotalPages());
        Assertions.assertEquals(isLast, postResponse.isLast());

        List<PostDto> content = postResponse.getContent();
        Assertions.assertNotNull(content);
        Assertions.assertEquals(posts.size(), content.size());
        PostDto dto = content.get(0);
        Assertions.assertNotNull(dto);
        Assertions.assertEquals(postDto.getTitle(), dto.getTitle());
        Assertions.assertEquals(postDto.getDescription(), dto.getDescription());
        Assertions.assertEquals(postDto.getContent(), dto.getContent());

    }

    @Test
    public void testGetAllPost_Pageable_SortDirDescending() {
        // nothing more different,  just make sortDir descending
        int pageNo = 1;
        int pageSize = 5;
        String sortBy = "title";
        String sortDir = Sort.Direction.DESC.name();
        Long totalElements = 22L;
        int totalPages = (int) Math.ceil(totalElements/pageSize);
        boolean isLast = pageNo == totalPages;

        List<Post> posts = new ArrayList<>();
        posts.add(post);

        // define the behaviors
        Page<Post> pagePosts = Mockito.mock(Page.class);
        Mockito.when(pagePosts.getContent()).thenReturn(posts);
        Mockito.when(pagePosts.getNumber()).thenReturn(pageNo);
        Mockito.when(pagePosts.getSize()).thenReturn(pageSize);
        Mockito.when(pagePosts.getTotalElements()).thenReturn(totalElements);
        Mockito.when(pagePosts.getTotalPages()).thenReturn(totalPages);
        Mockito.when(pagePosts.isLast()).thenReturn(isLast);

        Mockito.when(postRepositoryMock.findAll(ArgumentMatchers.any(PageRequest.class)))
                .thenReturn(pagePosts);

        // execute
        PostResponse postResponse = postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);

        // verify
        Assertions.assertNotNull(postResponse);
        Assertions.assertEquals(pageNo, postResponse.getPageNo());
        Assertions.assertEquals(pageSize, postResponse.getPageSize());
        Assertions.assertEquals(totalElements, postResponse.getTotalElements());
        Assertions.assertEquals(totalPages, postResponse.getTotalPages());
        Assertions.assertEquals(isLast, postResponse.isLast());

        List<PostDto> content = postResponse.getContent();
        Assertions.assertNotNull(content);
        Assertions.assertEquals(posts.size(), content.size());
        PostDto dto = content.get(0);
        Assertions.assertNotNull(dto);
        Assertions.assertEquals(postDto.getTitle(), dto.getTitle());
        Assertions.assertEquals(postDto.getDescription(), dto.getDescription());
        Assertions.assertEquals(postDto.getContent(), dto.getContent());
    }

    @AfterAll
    static void afterAll() {
        logger.info("Ending Test");
    }

}