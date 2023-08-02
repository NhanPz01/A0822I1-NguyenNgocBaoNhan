package com.example.ungdungmuonsach.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title", columnDefinition = "LONGTEXT")
    private String title;
    @Column(columnDefinition = "LONGTEXT")
    private String author;
    @Column(name = "summary", columnDefinition = "LONGTEXT")
    private String summary;
    private Integer amount;
}
