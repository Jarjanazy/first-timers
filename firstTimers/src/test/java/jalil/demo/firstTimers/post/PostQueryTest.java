package jalil.demo.firstTimers.post;

import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.post.service.PostService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PostQueryTest {
    @InjectMocks
    PostService postService;

    @Test
    void postServiceGivesSinglePost(){
        Flux<Post> allPosts = postService.getAllPosts();
        assertThat(allPosts.count().block()).isEqualTo(1L);
    }

}
