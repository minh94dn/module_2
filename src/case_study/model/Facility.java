package case_study.model;

public abstract class ResortFurama {
    private String id;
    private String name;
    private double roomArea;
    private double rentalFee;
    private int maxPeople;
    private double rentalType;

    public ResortFurama() {
    }

    public ResortFurama(String id, String name, double roomArea, double rentalFee, int maxPeople, double rentalType) {
        this.id = id;
        this.name = name;
        this.roomArea = roomArea;
        this.rentalFee = rentalFee;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public double getRentalType() {
        return rentalType;
    }

    public void setRentalType(double rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "ResortFurama{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", roomArea=" + roomArea +
                ", rentalFee=" + rentalFee +
                ", maxPeople=" + maxPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
