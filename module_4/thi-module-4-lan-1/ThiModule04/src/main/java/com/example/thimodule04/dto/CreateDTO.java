package com.example.thimodule04.dto;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.sql.Date;

public class CreateDTO {
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^DA-[0-9]{4}", message = "Phải có dạng DA-XXXX trong đó XXXX là các số từ 0 đến 9")
//    @UniqueElements(message = "Mã dự án đã tồn tại")
    private String id;
    @NotBlank(message = "Không được để trống")
    private String businessName;
    @NotBlank(message = "Không được để trống")
    private String name;
    @NotNull(message = "Không được để trống")
    @Min(value = 30000000, message = "Kinh phí yêu cầu tối thiểu 30.000.000 VNĐ")
    private Double cost;
    @NotBlank(message = "Không được để trống")
    private String description;
    @NotNull(message = "Không được để trống")
    @Min(value = 1, message = "Thời gian đăng ký trong khoảng 1 đến 12 tháng")
    @Max(value = 1, message = "Thời gian đăng ký trong khoảng 1 đến 12 tháng")
    private Integer registeringTime;
    private Date createdDate;

    public CreateDTO() {
    }

    public CreateDTO(String id, String businessName, String name, Double cost, String description, Integer registeringTime, Date createdDate) {
        this.id = id;
        this.businessName = businessName;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.registeringTime = registeringTime;
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRegisteringTime() {
        return registeringTime;
    }

    public void setRegisteringTime(Integer registeringTime) {
        this.registeringTime = registeringTime;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
