package com.example.ungdungmuonsach.dto;

import com.example.ungdungmuonsach.model.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractCreateDTO {
    private Integer id;
    private Book book;
}
