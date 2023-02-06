package model;

import util.ConstantUtil.RentType;
import util.ConstantUtil.RoomType;

public class House extends Facility {
    private RoomType roomType;
    private int numberOfFloor;

    public House() {
    }

    public House(String serviceName, double usingArea, double rentFee, int maxNumberOfCustomer, RentType rentType, RoomType roomType, int numberOfFloor) {
        super(serviceName, usingArea, rentFee, maxNumberOfCustomer, rentType);
        this.roomType = roomType;
        this.numberOfFloor = numberOfFloor;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", super.toString(), this.roomType.name(), this.numberOfFloor);
    }
}
