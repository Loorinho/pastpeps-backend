package com.loorinho.pastpepsbackend.model.university;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {

    @Id
    @SequenceGenerator(
            name = "university_sequence",
            sequenceName = "university_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "university_sequence"
    )
    private Long id;
    private String name;
    private String slug;

}
