package com.lessons.maven.exams4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "pot")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pot {
    private LocalDate comeIn;
    private LocalDate comeOut;
    private Quality quality;
    @Id
    private Long id;
    public enum Quality{
        BEST,GOOD,LOW
    }
    @ManyToOne
    private Track track;

}
