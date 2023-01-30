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

    //Get Post by Id
    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id){
        return ResponseEntity.ok(postService.getPostById(id));
    }

    //Update post by Id
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto, @PathVariable(name = "id") long id){
        PostDto postResponse = postService.updatePost(postDto, id);
        return new ResponseEntity<>(postResponse, HttpStatus.OK);
    }

    //Delete post by id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id){
        postService.deletePost(id);

        return new ResponseEntity<>("Post entity deleted successfully", HttpStatus.OK);
    }
}
