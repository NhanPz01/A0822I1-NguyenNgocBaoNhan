package models;

public abstract class Facility {
    protected final int FOR_YEAR = 1;
    protected final int FOR_MONTH = 2;
    protected final int FOR_DAY = 3;
    protected final int FOR_HOUR = 4;
    protected String serviceName;
    protected String serviceArea;
    protected double rent;
    protected int maxCustomer;
    protected String typeRent;

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

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }
}
