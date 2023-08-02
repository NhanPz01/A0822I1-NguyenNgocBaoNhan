package com.example.bucanhcuangay.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    @Column(columnDefinition = "LONGTEXT", nullable = false)
    private String content;
    private Integer rating;
    private Integer likes;
    private Date commentedDate;
}
