package snowblind.springboot.blog.service;

import snowblind.springboot.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    public CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);
}
