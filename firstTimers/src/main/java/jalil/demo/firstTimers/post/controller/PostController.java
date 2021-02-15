package jalil.demo.firstTimers.post.controller;

import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/posts")
    public Flux<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @PostMapping("/post")
    public Mono<Post> addNewPost(@RequestBody Post postFromClient){
        return postService.addNewPost(postFromClient);
    }
}
