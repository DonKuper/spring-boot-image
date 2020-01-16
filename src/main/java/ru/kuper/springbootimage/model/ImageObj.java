package ru.kuper.springbootimage.model;

import lombok.Data;
import ru.kuper.springbootimage.ImageState;

import javax.persistence.*;

@Data
@Entity
public class ImageObj {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    private byte[] imageContent;

    public ImageObj(String name, byte[] imageContent) {
        this.name = name;
        this.imageContent = imageContent;
    }

    //    @Enumerated(EnumType.STRING)
//    private ImageState state;


}

