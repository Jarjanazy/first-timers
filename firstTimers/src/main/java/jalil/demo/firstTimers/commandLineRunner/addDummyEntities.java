package jalil.demo.firstTimers.commandLineRunner;

import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class addDummyEntities implements CommandLineRunner {
    private final PostRepository postRepository;

    @Override
    public void run(String... args){
        log.info("I am alive !!!!");
        Post post = Post.builder().id("1").title("test").build();
        postRepository.save(post).subscribe();
    }
}
