package com.example.furama_resort_management.model.facility;

import javax.persistence.*;

@Entity
@Table(name = "facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", columnDefinition = "VARCHAR(45)")
    private String name;
    private Integer area;
    private Double cost;
    @Column(name = "max_people", columnDefinition = "INTEGER")
    private Integer maxPeople;
    @ManyToOne
    @JoinColumn(name = "rent_type")
    private RentType rentType;
    @ManyToOne
    @JoinColumn(name = "facility_type")
    private FacilityType facilityType;
    @Column(name = "standard_room", columnDefinition = "VARCHAR(45)")
    private String standardRoom;
    @Column(name = "description_other_convenience", columnDefinition = "VARCHAR(45)")
    private String descriptionOtherConvenience;
    @Column(name = "pool_area", columnDefinition = "DOUBLE")
    private Double poolArea;
    @Column(name = "number_of_floors", columnDefinition = "INTEGER")
    private Integer numberOfFloors;
    @Column(name = "facility_free", columnDefinition = "TEXT")
    private String facilityFree;

    public Facility() {
    }

    public Facility(Integer id, String name, Integer area, Double cost, Integer maxPeople, RentType rentType, FacilityType facilityType, String standardRoom, String descriptionOtherConvenience, Double poolArea, Integer numberOfFloors, String facilityFree) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.facilityType = facilityType;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.facilityFree = facilityFree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
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

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}
