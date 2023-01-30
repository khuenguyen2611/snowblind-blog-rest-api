package snowblind.springboot.blog.service;

import snowblind.springboot.blog.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPost();

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePost(long id);
}
