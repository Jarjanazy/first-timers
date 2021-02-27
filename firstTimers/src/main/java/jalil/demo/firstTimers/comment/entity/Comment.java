package jalil.demo.firstTimers.comment.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jalil.demo.firstTimers.post.entity.Post;
import jalil.demo.firstTimers.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Document
public class Comment {
    @Id
    private String id;
    private String postId;
    private User owner;
    private String body;
}
