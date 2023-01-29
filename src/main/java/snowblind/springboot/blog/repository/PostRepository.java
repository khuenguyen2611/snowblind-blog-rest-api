package snowblind.springboot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import snowblind.springboot.blog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
