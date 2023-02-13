package snowblind.springboot.blog.service;

import snowblind.springboot.blog.payload.PostDto;
import snowblind.springboot.blog.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePost(long id);

    List<PostDto> getPostsByCategory(Long categoryId);
}
