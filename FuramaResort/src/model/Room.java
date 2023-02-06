package model;

import util.ConstantUtil.RentType;

public class Room extends Facility {
    private String freeAttachService;

    public Room() {
    }

    public Room(String serviceName, double usingArea, double rentFee, int maxNumberOfCustomer, RentType rentType, String freeAttachService) {
        super(serviceName, usingArea, rentFee, maxNumberOfCustomer, rentType);
        this.freeAttachService = freeAttachService;
    }

    public String getFreeAttachService() {
        return freeAttachService;
    }

    public void setFreeAttachService(String freeAttachService) {
        this.freeAttachService = freeAttachService;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), this.freeAttachService);
    }
}
