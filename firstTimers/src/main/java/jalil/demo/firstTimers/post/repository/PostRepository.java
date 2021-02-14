package jalil.demo.firstTimers.post.repository;

import jalil.demo.firstTimers.post.entity.Post;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends ReactiveCrudRepository<Post, String> {
}
