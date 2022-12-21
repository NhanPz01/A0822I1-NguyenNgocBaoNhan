package models;

public class House extends Facility {
    String roomStandard;
    int Floors;

    public House() {
    }

    public House(String serviceName, String serviceArea, double rent, int maxCustomer, TypeRent typeRent, String roomStandard, int floors) {
        super(serviceName, serviceArea, rent, maxCustomer, typeRent);
        this.roomStandard = roomStandard;
        Floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return Floors;
    }

    public void setFloors(int floors) {
        Floors = floors;
    }
}
