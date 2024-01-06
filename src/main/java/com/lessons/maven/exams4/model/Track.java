package com.lessons.maven.exams4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="tracks")
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalDate goToFishing;
    @Column
    private LocalDate comeBack;
    @ManyToMany(mappedBy = "track")
    private List<Pot> pots;


    @OneToMany(mappedBy = "track")
    private List <Fish> fish;

}
