package com.lessons.maven.exams4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Column
    private String name;
    @Column
    private String address;
    @Column
    @Enumerated(value = EnumType.STRING)
    private PersonType type;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "track")
    private Track track;



    private enum PersonType {
        CAPTAIN,BOCMAN,SAILOR
    }
}
