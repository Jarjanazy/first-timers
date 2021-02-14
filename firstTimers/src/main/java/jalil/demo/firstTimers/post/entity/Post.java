package jalil.demo.firstTimers.post.entity;


import jalil.demo.firstTimers.comment.entity.Comment;
import jalil.demo.firstTimers.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor
@Builder
@Document
public class Post {
    @Id
    private String id;
    private Date publicationDate;
    private String title;
    private User owner;
    private Set<Comment> comments;
}
