package snowblind.springboot.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import snowblind.springboot.blog.entity.Post;
import snowblind.springboot.blog.payload.PostDto;
import snowblind.springboot.blog.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //Create Post
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }

    //Get All Post
    @GetMapping
    public List<PostDto> getAllPost(){
        return postService.getAllPost();
    }
}
