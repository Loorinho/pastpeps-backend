package com.loorinho.pastpepsbackend.model.pastpaper;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PastPaper {

    @Id
    @SequenceGenerator(
            name = "pastpaper_sequence",
            sequenceName = "pastpaper_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pastpaper_sequence"
    )

    private Long id;
    private String fileName;
    private String fileType;
    private byte[] data;
}
