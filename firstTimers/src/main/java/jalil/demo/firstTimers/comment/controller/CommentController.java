package jalil.demo.firstTimers.comment.controller;

import jalil.demo.firstTimers.comment.entity.Comment;
import jalil.demo.firstTimers.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController @RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("comment/{postId}")
    public Flux<Comment> getPostComments(String postId){
        return commentService.getPostComments(postId);
    }

}
