package com.example.furama_resort_management.dto;

import com.example.furama_resort_management.model.facility.RentType;
import com.sun.xml.bind.api.impl.NameConverter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;


public class CreateVillaDTO implements Validator {
    @NotBlank(message = "You should fill it")
    private String name;
    @NotBlank(message = "You should fill it")
    private String area;
    @NotNull(message = "You should fill it")
    @PositiveOrZero(message = "Cost couldn't positive")
    private Double cost;
    @NotNull(message = "You should fill it")
    @PositiveOrZero(message = "Number of people couldn't negative")
    private Integer maxNumberOfPeople;
    private RentType rentType;
    private String standardRoom;
    private String descriptionOtherConvenience;
    @NotNull(message = "You should fill it")
    @PositiveOrZero(message = "Area couldn't positive")
    private Double poolArea;
    @NotNull(message = "You should fill it")
    @PositiveOrZero(message = "Number of floors couldn't negative")
    private Integer numberOfFloors;

    public CreateVillaDTO() {
    }

    public CreateVillaDTO(String name, String area, Double cost, Integer maxNumberOfPeople, RentType rentType, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloors) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentType = rentType;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(Integer maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
