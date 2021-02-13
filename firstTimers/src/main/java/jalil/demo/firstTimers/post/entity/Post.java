package jalil.demo.firstTimers.post.entity;


import jalil.demo.firstTimers.comment.entity.Comment;
import jalil.demo.firstTimers.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Post {
    private Integer id;
    private Date publicationDate;
    private String title;
    private User owner;
    private Set<Comment> comments;
}
