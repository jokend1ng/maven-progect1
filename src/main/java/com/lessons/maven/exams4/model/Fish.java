package com.lessons.maven.exams4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fish")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Fish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @Enumerated(value = EnumType.STRING)
    private SortOfFish sort;

    @Column
    private double weight;
    @ManyToOne
    @JoinColumn(name = "track_id", nullable = false)
    private Track track;

    private enum SortOfFish{
        TRESKA,SELD,MINTAY,LOSOS
    }

}
