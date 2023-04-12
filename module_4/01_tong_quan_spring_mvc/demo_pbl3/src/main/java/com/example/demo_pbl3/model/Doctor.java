package com.example.demo_pbl3.model;

public class Doctor extends User {
    private String id;
    private String branch;
    private int rating;
    private int experience;
    private String workingHospital;
    private String place;
    private String address;    // địa chỉ phòng khám

    public Doctor(
            String name,
            String phoneNumber,
            String email,
            int age,
            String gender) {
        super(name, phoneNumber, email, age, gender);
    }

    public Doctor(
            String name,
            String phoneNumber,
            String email,
            int age,
            String gender,
            String id,
            String branch,
            int rating,
            int experience,
            String workingHospital,
            String place,
            String address) {
        super(name, phoneNumber, email, age, gender);
        this.id = id;
        this.branch = branch;
        this.rating = rating;
        this.experience = experience;
        this.workingHospital = workingHospital;
        this.place = place;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getWorkingHospital() {
        return workingHospital;
    }

    public void setWorkingHospital(String workingHospital) {
        this.workingHospital = workingHospital;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
