package jalil.demo.firstTimers.post.controller;

import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/posts")
    public Flux<Post> getAllPosts(){
        return postService.getAllPosts();
    }
}
