package jalil.demo.firstTimers.post.service;

import jalil.demo.firstTimers.post.entity.Post;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PostService {

    public Flux<Post> getAllPosts(){
        Post post = Post.builder().id(1).title("test post").build();
        return Flux.just(post);
    }

}
