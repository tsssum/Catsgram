package catsgram.model;

import java.time.Instant;

import lombok.Data;

@Data
@lombok.EqualsAndHashCode(of = {"id"})
public class Post {
    Long id;
    long authorId;
    String description;
    Instant postDate;
}
