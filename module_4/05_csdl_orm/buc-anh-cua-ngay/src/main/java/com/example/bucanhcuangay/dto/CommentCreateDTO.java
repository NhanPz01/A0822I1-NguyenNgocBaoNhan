package com.example.bucanhcuangay.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommentCreateDTO {
    private String author;
    private String content;
    private Integer rating;
}
