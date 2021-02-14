package jalil.demo.firstTimers.post.service;

import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Flux<Post> getAllPosts(){
        return postRepository.findAll();
    }

}
