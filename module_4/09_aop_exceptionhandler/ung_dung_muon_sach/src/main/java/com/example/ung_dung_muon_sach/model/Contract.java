package com.example.ung_dung_muon_sach.model;

import javax.persistence.*;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INTEGER")
    private int contractId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "return_code", columnDefinition = "VARCHAR(5)")
    private String returnCode;
    @Column(name = "status", columnDefinition = "TINYINT")
    private Boolean contractStatus;

    public Contract() {
    }

    public Contract(int contractId, Book book, Customer customer, String returnCode, Boolean contractStatus) {
        this.contractId = contractId;
        this.book = book;
        this.customer = customer;
        this.returnCode = returnCode;
        this.contractStatus = contractStatus;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public Boolean getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Boolean contractStatus) {
        this.contractStatus = contractStatus;
    }
}
