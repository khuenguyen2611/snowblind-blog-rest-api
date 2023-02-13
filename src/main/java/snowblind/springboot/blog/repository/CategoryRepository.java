package snowblind.springboot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import snowblind.springboot.blog.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
