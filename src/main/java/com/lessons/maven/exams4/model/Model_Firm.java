//package com.lessons.maven.exams4.model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import java.util.List;
//@Entity
//@Table(name = "firm")
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Inheritance(strategy = InheritanceType.JOINED)
//public class Model_Firm {
//
//    @OneToMany
//    @JoinColumn (name = "track_id" )
//    private List<Track> track;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column
//    @ManyToMany
//    private List<Fish>fishList;
//
//
//}
