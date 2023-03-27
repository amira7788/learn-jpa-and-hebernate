package com.tachla.springboot.learnjpaandhebernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Course {
    @Id
    private long id;
    //@Column(name="name")
    private String name;
    //@Column(name="author")
    private String author;
}
