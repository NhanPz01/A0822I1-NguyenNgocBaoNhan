package model;

import util.ConstantUtil.RentType;

public abstract class Facility {
    private String serviceName;
    private double areaUsed;
    private double price;
    private int maxPeople;
    private RentType rentType;

    public Facility() {
    }

    public Facility(String serviceName, double areaUsed, double price, int maxPeople, RentType rentType) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s", this.serviceName, this.areaUsed, this.price, this.maxPeople, this.rentType.name());
    }
}
