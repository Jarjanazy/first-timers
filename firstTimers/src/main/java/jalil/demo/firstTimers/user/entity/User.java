package jalil.demo.firstTimers.user.entity;

import jalil.demo.firstTimers.post.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data @NoArgsConstructor @AllArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private Set<Post> posts;
}
