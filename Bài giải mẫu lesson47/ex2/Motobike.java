package net.braniumacademy.l47.ex2;

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

    // ghi đè các phương thức của lớp cha
    @Override
    public void startEngine() {
        super.startEngine(); // gọi phương thức gốc của lớp cha
        System.out.println("Xe tay ga khởi động bằng cách đề");
    }

    @Override
    public void stopEngine() {
        super.stopEngine(); // gọi phương thức gốc của lớp cha
        System.out.println("Xe máy tắt máy bằng cách vặn chìa khóa");
    }

    @Override
    public void speedUp() {
        super.speedUp(); // gọi phương thức gốc của lớp cha
        System.out.println("Xe máy tăng tốc bằng cách vít ga");
    }

    @Override
    public void brake() {
        super.brake(); // gọi phương thức gốc của lớp cha
        System.out.println("Xe máy phanh bằng phanh tay hoặc phanh chân");
    }

    @Override
    public void turnLight() {
        super.turnLight(); // gọi phương thức gốc của lớp cha
        System.out.println("Xe máy bật đèn chiếu xa");
    }

    public final int getNumOfWheel() {
        return numOfWheel;
    }

    public final void setNumOfWheel(int numOfWheel) {
        this.numOfWheel = numOfWheel;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getTypeOfEnergy() {
        return typeOfEnergy;
    }

    public final void setTypeOfEnergy(String typeOfEnergy) {
        this.typeOfEnergy = typeOfEnergy;
    }

    public final String getTireType() {
        return tireType;
    }

    public final void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public final String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public final void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public final float getTraveledDistance() {
        return traveledDistance;
    }

    public final void setTraveledDistance(float traveledDistance) {
        this.traveledDistance = traveledDistance;
    }
}
