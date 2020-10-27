package net.braniumacademy.l47.ex2;

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

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Xe khách khởi động bằng nhấn nút đề");
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
        System.out.println("Xe khách tắt máy khi hết xăng");
    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Xe khách tăng tốc bằng đạp ga");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Xe khách phanh bằng phanh tay và phanh chân");
    }

    @Override
    public void turnLight() {
        super.turnLight();
        System.out.println("Xe khách bật đèn tự động khi trời tối");
    }

    public final int getNumOfSeats() {
        return numOfSeats;
    }

    public final void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public final float getMaxPayload() {
        return maxPayload;
    }

    public final void setMaxPayload(float maxPayload) {
        this.maxPayload = maxPayload;
    }

    public final float getOrbit() {
        return orbit;
    }

    public final void setOrbit(float orbit) {
        this.orbit = orbit;
    }

    public final float getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public final void setFuelTankCapacity(float fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public final int getNumOfPT() {
        return numOfPT;
    }

    public final void setNumOfPT(int numOfPT) {
        this.numOfPT = numOfPT;
    }
}
