package ru.patterns.homework3.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "subject")
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
    private List<Student> students;

    @Column(name = "name", unique = true)
    private String name;

}
