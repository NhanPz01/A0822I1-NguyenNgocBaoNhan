package models;

public class Booking {
    String bookingId;
    String checkinDate;
    String checkoutDate;
    String customerId;
    String serviceName;
    String serviceType;

    public Booking() {
    }

    public Booking(String bookingId, String checkinDate, String checkoutDate, String customerId, String serviceName, String serviceType) {
        this.bookingId = bookingId;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.customerId = customerId;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
