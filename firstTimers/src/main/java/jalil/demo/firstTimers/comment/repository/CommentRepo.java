package jalil.demo.firstTimers.comment.repository;

import jalil.demo.firstTimers.comment.entity.Comment;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CommentRepo extends ReactiveCrudRepository<Comment, String> {
    Flux<Comment> findByPostId(String id);
}
