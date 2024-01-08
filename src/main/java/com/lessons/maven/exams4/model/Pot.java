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
@Table(name = "pot")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pot {
    private LocalDate comeIn;
    private LocalDate comeOut;
    @Enumerated(value = EnumType.STRING)
    private Quality quality;
    @Id
    private Long id;
    public enum Quality{
        BEST,GOOD,LOW
    }
    @ManyToMany
    private List<Track> track =new ArrayList<>();

}
