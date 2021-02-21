package jalil.demo.firstTimers.post.service;

import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {
    private final PostRepository postRepository;

    public Flux<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Mono<Post> addNewPost(Post postFromClient) {
        return postRepository.save(postFromClient);
    }

    public ResponseEntity<?> deletePost(String id) {
        postRepository.
                findById(id).
                map(Optional::ofNullable).
                defaultIfEmpty(Optional.empty()).
                doOnSuccess(post -> checkAndDeletePost(post, id)).
                subscribe();
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<?> updatePost(Post updatedPost){
        postRepository.
                findById(updatedPost.getId()).
                map(Optional::ofNullable).
                defaultIfEmpty(Optional.empty()).
                doOnSuccess(oldPost -> checkAndUpdatePost(oldPost, updatedPost)).
                subscribe();
        return ResponseEntity.ok().build();
    }

    private void checkAndUpdatePost(Optional<Post> oldPost, Post updatedPost) {
        oldPost.ifPresentOrElse(
                oldP -> postRepository.save(updatedPost).subscribe(),
                () -> log.info(String.format("%s Post doesn't exist", updatedPost.getId())));
    }

    private void checkAndDeletePost(Optional<Post> post, String id) {
        post.ifPresentOrElse(
                postRepository::delete,
                () -> log.info(String.format("%s Post doesn't exist", id)));
    }

    public Mono<ResponseEntity<?>> getPostById(String id) {
        return postRepository.
                findById(id).
                map(ResponseEntity::ok);
    }

}
