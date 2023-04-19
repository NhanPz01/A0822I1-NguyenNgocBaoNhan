package com.example.form_to_khai_y_te.model;

public class Form {
    private int id;
    private Person personInfo;

    public Form() {
    }

    public Form(int id, Person personInfo) {
        this.id = id;
        this.personInfo = personInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(Person personInfo) {
        this.personInfo = personInfo;
    }
}
