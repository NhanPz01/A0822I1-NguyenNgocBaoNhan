package models;

public class Contract {
    String contractId;
    String bookingId;
    double advancePayment;
    double totalPayment;
    String customerId;

    public Contract() {
    }

    public Contract(String contractId, String bookingId, double advancePayment, double totalPayment, String customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.advancePayment = advancePayment;
        this.totalPayment = totalPayment;
        this.customerId = customerId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
