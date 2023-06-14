package com.example.thimodule04.dto;

import com.example.thimodule04.model.QuestionType;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class CreateDTO {
    @NotBlank(message = "Không được để trống")
//    @Min(value = 4, message = "Từ 5 ký tự")
//    @Max(value = 100, message = "Không quá 100 ký tự")
    @Size(min = 5, max = 100, message = "Tiêu đề từ 5 đến 100 ký tự")
    private String title;
    @NotBlank(message = "Không được để trống")
//    @Min(value = 10, message = "Từ 10 ký tự")
//    @Max(value = 500, message = "Không quá 500 ký tự")
    @Size(min = 10, max = 500, message = "Nội dung từ 10 đến 500 ký tự")
    private String content;
    @NotNull(message = "Phải chọn loại câu hỏi")
    private QuestionType questionType;

    public CreateDTO() {
    }

    public CreateDTO(String title, String content, QuestionType questionType) {
        this.title = title;
        this.content = content;
        this.questionType = questionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
