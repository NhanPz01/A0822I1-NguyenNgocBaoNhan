package model;

import util.ConstantUtil.RoomType;
import util.ConstantUtil.RentType;

public class Villa extends Facility {
    private RoomType roomType;
    private double poolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String serviceName, double usingArea, double rentFee, int maxNumberOfCustomer, RentType rentType, RoomType roomType, double poolArea, int numberOfFloor) {
        super(serviceName, usingArea, rentFee, maxNumberOfCustomer, rentType);
        this.roomType = roomType;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", super.toString(), this.roomType.name(), this.poolArea, this.numberOfFloor);
    }
}
