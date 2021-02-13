package jalil.demo.firstTimers.group.entity;

import jalil.demo.firstTimers.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor
public class Group {
    private Integer id;
    private String name;
    private Set<User> members;
}
