package jalil.demo.firstTimers.post.handler;

import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.post.repository.PostRepository;
import jalil.demo.firstTimers.post.service.PostService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class PostHandler {
    private final PostService postService;

    public PostHandler(PostService postService) {
        this.postService = postService;
    }

    public Mono<ServerResponse> greeting(ServerRequest serverRequest){
        return ServerResponse.
                ok().
                contentType(MediaType.APPLICATION_JSON).
                body(Mono.just("Hey there"), String.class);
    }

    public Mono<ServerResponse> getPosts(ServerRequest serverRequest){
        return ServerResponse.
                ok().
                contentType(MediaType.APPLICATION_JSON).
                body(postService.getAllPosts(), Post.class);
    }

}
