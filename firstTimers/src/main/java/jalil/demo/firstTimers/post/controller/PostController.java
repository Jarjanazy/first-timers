package jalil.demo.firstTimers.post.controller;

import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/post/{id}")
    public Mono<Post> getPostById(@PathVariable String id){
        return postService.getPostById(id);
    }

    @PostMapping("/post")
    public Mono<Post> addNewPost(@RequestBody Post postFromClient){
        return postService.addNewPost(postFromClient);
    }

    @DeleteMapping("/post")
    public Mono<ResponseEntity<Object>> deletePost(@RequestBody String id){
        return postService.deletePost(id);
    }

    @PatchMapping("/post")
    public Mono<ResponseEntity<Object>> updatePost(@RequestBody Post post){
        return postService.updatePost(post);
    }
}
