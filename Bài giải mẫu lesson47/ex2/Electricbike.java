package net.braniumacademy.l47.ex2;

public class Electricbike extends Vehicle {
    private String color; // màu
    private float voltage; // điện áp
    private float kmPerCharge; // số km đi được trong một lần sạc đầy
    private float chargingTime; // thời gian để sạc đầy
    private float chargingVoltage; // điện áp sạc

    public Electricbike() {
    }

    public Electricbike(String color, float voltage, float kmPerCharge,
                        float chargingTime, float chargingVoltage) {
        this.color = color;
        this.voltage = voltage;
        this.kmPerCharge = kmPerCharge;
        this.chargingTime = chargingTime;
        this.chargingVoltage = chargingVoltage;
    }

    public Electricbike(String brand, int year, String madeIn, float price,
                        String size, float weight, String lisensePlate,
                        String color, float voltage, float kmPerCharge,
                        float chargingTime, float chargingVoltage) {
        super(brand, year, madeIn, price, size, weight, lisensePlate);
        this.color = color;
        this.voltage = voltage;
        this.kmPerCharge = kmPerCharge;
        this.chargingTime = chargingTime;
        this.chargingVoltage = chargingVoltage;
    }

    // ghi đè các phương thức của lớp cha
    @Override
    public void startEngine() {
        super.startEngine(); // gọi phương thức nguyên bản
        System.out.println("Xe máy điện khởi động bằng cách vặn chìa khóa");
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
        System.out.println("Xe máy điện ngắt nguồn bằng cách vặn chìa khóa");
    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Xe máy điện tăng tốc bằng cách vít ga");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Xe máy điện phanh bằng phanh tay");
    }

    @Override
    public void turnLight() {
        super.turnLight();
        System.out.println("Xe máy điện bật đèn bằng công tắc");
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final float getVoltage() {
        return voltage;
    }

    public final void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public final float getKmPerCharge() {
        return kmPerCharge;
    }

    public final void setKmPerCharge(float kmPerCharge) {
        this.kmPerCharge = kmPerCharge;
    }

    public final float getChargingTime() {
        return chargingTime;
    }

    public final void setChargingTime(float chargingTime) {
        this.chargingTime = chargingTime;
    }

    public final float getChargingVoltage() {
        return chargingVoltage;
    }

    public final void setChargingVoltage(float chargingVoltage) {
        this.chargingVoltage = chargingVoltage;
    }
}
