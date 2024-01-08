package com.lessons.maven.exams4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "boat")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String type;
    @Enumerated(value = EnumType.STRING)
    private Displacement displacement;
    @Column
    private LocalDate dateOfCreate;
    @OneToMany
    @JoinColumn(name = "boat_id")
    private List<Track> tracks =new ArrayList<>();



    public enum Displacement {
        LIGHTWEIGHT,STANDART,NORMAL,LOADED,FULLLOADED,DESIGNATED,LIGHT
    }
}
