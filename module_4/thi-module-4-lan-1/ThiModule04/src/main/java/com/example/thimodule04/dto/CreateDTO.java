package com.example.thimodule04.dto;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.sql.Date;

public class CreateDTO {
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^MGD-[0-9]{4}", message = "Phải có dạng MGD-XXXX trong đó XXXX là các số từ 0 đến 9")
    private String id;
    @NotNull(message = "Không được để trống")
    private String name;
    @NotBlank(message = "Không được để trống")
    private String dealType;
    @NotNull(message = "Không được để trống")
    @FutureOrPresent(message = "Ngày giao dịch không thể là quá khứ")
    private Date dealDate;
    @NotNull(message = "Không được để trống")
    @Min(value = 500000, message = "Đơn giá phải cao hơn 500,000")
    private Double cost;
    @NotNull(message = "Không được để trống")
    @Min(value = 20, message = "Diện tích phải cao hơn 20")
    private Double area;

    public CreateDTO() {
    }

    public CreateDTO(String id, String name, String dealType, Date dealDate, Double cost, Double area) {
        this.id = id;
        this.name = name;
        this.dealType = dealType;
        this.dealDate = dealDate;
        this.cost = cost;
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
