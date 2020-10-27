package net.braniumacademy.l44.ex2;

public class Bus extends Automobile {
    private int numOfSeats; // số ghế
    private float maxPayload; // tải trọng tối đa
    private float orbit; // tầm hoạt động
    private float fuelTankCapacity; // dung tích bình nhiên liệu
    private int numOfPT; // số lượng khách đã chuyên chở được

    public Bus() {
    }

    public Bus(int numOfSeats, float maxPayload, float orbit,
               float fuelTankCapacity, int numOfPT) {
        this.numOfSeats = numOfSeats;
        this.maxPayload = maxPayload;
        this.orbit = orbit;
        this.fuelTankCapacity = fuelTankCapacity;
        this.numOfPT = numOfPT;
    }

    public Bus(int numOfWheel, String engineType, String name, String color,
               Owner owner, int numOfSeats, float maxPayload, float orbit,
               float fuelTankCapacity, int numOfPT) {
        super(numOfWheel, engineType, name, color, owner);
        this.numOfSeats = numOfSeats;
        this.maxPayload = maxPayload;
        this.orbit = orbit;
        this.fuelTankCapacity = fuelTankCapacity;
        this.numOfPT = numOfPT;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public float getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(float maxPayload) {
        this.maxPayload = maxPayload;
    }

    public float getOrbit() {
        return orbit;
    }

    public void setOrbit(float orbit) {
        this.orbit = orbit;
    }

    public float getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(float fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getNumOfPT() {
        return numOfPT;
    }

    public void setNumOfPT(int numOfPT) {
        this.numOfPT = numOfPT;
    }
}
