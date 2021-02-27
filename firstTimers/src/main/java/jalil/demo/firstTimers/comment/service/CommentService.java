package jalil.demo.firstTimers.comment.service;

import jalil.demo.firstTimers.comment.entity.Comment;
import jalil.demo.firstTimers.comment.repository.CommentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service @RequiredArgsConstructor
public class CommentService {
    private final CommentRepo commentRepo;

    public Flux<Comment> getPostComments(String postId) {
        return commentRepo.findByPostId(postId);
    }
}
