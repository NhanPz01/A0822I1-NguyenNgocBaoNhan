package models;

public abstract class Facility {
    enum TypeRent {
        ForYear, ForMonth, ForDay, ForHour
    }

    protected String serviceName;
    protected String serviceArea;
    protected double rent;
    protected int maxCustomer;
    protected TypeRent typeRent;

    public Facility() {
    }

    public Facility(String serviceName, String serviceArea, double rent, int maxCustomer, TypeRent typeRent) {
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.rent = rent;
        this.maxCustomer = maxCustomer;
        this.typeRent = typeRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getMaxCustomer() {
        return maxCustomer;
    }

    public void setMaxCustomer(int maxCustomer) {
        this.maxCustomer = maxCustomer;
    }

    public TypeRent getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(TypeRent typeRent) {
        this.typeRent = typeRent;
    }
}
