package jalil.demo.firstTimers.commandLineRunner;

import jalil.demo.firstTimers.comment.entity.Comment;
import jalil.demo.firstTimers.comment.repository.CommentRepo;
import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

@Component
@Slf4j
@RequiredArgsConstructor
public class addDummyEntities implements CommandLineRunner {
    private final PostRepository postRepository;
    private final CommentRepo commentRepo;

    @Override
    public void run(String... args){
        log.info("I am alive !!!!");
        Post post = Post.builder().id("1").title("test").build();

        Flux.just(
                Comment.builder().id("2").postId("1").body("testComment1").build(),
                Comment.builder().id("3").postId("1").body("testComment2").build()).
                flatMap(commentRepo::save).
                subscribe();

        postRepository.save(post).subscribe();
    }
}
