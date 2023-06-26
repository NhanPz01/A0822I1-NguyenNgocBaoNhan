package com.example.validate_form_dang_ky.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateDto {
    @NotBlank(message = "Could not empty")
    @Size(min = 5, max = 45, message = "Could be between 5 and 45 characters")
    private String firstName;
    @NotBlank(message = "Could not empty")
    @Size(min = 5, max = 45, message = "Could be between 5 and 45 characters")
    private String lastName;
    @NotBlank(message = "Could not empty")
    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", message = "Could be a exist phone number")
    private String phoneNumber;
    @NotNull(message = "Could not empty")
    @PositiveOrZero(message = "Could not be zero or positive")
    @Min(value = 18, message = "Age could be greater than 18")
    private Integer age;
    @NotBlank(message = "Could not empty")
    @Pattern(regexp = "/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/.", message = "Example: abc@gmail.com")
    private String email;
}
