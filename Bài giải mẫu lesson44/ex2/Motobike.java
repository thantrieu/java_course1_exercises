package net.braniumacademy.l44.ex2;

public class Motobike extends Vehicle {
    private int numOfWheel; // số bánh xe
    private String name; // tên
    private String color; // màu
    private String typeOfEnergy; /// loại động cơ
    private String tireType; // loại lốp
    private String cylinderCapacity; // dung tích xi lanh
    private float traveledDistance; // khoảng cách đã di chuyển

    public Motobike() {
    }

    public Motobike(int numOfWheel) {
        this.numOfWheel = numOfWheel;
    }

    public Motobike(int numOfWheel, String name, String color,
                    String typeOfEnergy, String tireType,
                    String cylinderCapacity, float traveledDistance) {
        this.numOfWheel = numOfWheel;
        this.name = name;
        this.color = color;
        this.typeOfEnergy = typeOfEnergy;
        this.tireType = tireType;
        this.cylinderCapacity = cylinderCapacity;
        this.traveledDistance = traveledDistance;
    }

    public Motobike(String brand, int year, String madeIn,
                    float price, String size, float weight,
                    String lisensePlate, int numOfWheel, String name,
                    String color, String typeOfEnergy, String tireType,
                    String cylinderCapacity, float traveledDistance) {
        super(brand, year, madeIn, price, size, weight, lisensePlate);
        this.numOfWheel = numOfWheel;
        this.name = name;
        this.color = color;
        this.typeOfEnergy = typeOfEnergy;
        this.tireType = tireType;
        this.cylinderCapacity = cylinderCapacity;
        this.traveledDistance = traveledDistance;
    }

    public int getNumOfWheel() {
        return numOfWheel;
    }

    public void setNumOfWheel(int numOfWheel) {
        this.numOfWheel = numOfWheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeOfEnergy() {
        return typeOfEnergy;
    }

    public void setTypeOfEnergy(String typeOfEnergy) {
        this.typeOfEnergy = typeOfEnergy;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public float getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(float traveledDistance) {
        this.traveledDistance = traveledDistance;
    }
}
