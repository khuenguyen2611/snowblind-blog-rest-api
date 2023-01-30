package snowblind.springboot.blog.service;

import snowblind.springboot.blog.payload.PostDto;

import java.util.List;

public interface PostService {
    public PostDto createPost(PostDto postDto);

    public List<PostDto> getAllPost();
}
