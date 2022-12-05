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
}
