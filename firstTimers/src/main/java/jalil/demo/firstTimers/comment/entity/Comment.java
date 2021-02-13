package jalil.demo.firstTimers.comment.entity;

import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Comment {
    private Integer id;
    private Post post;
    private User owner;
}
