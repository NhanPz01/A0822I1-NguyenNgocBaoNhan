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
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String password;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
