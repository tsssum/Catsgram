package catsgram.model;

import lombok.Data;

@Data
@lombok.EqualsAndHashCode(of = {"id"})
public class Image {
    private Long id;
    private long postId;
    private String originalFileName; // шоб скачать из приложения с оригинальным названием но хранить с собственными
    private String filePath;
}
