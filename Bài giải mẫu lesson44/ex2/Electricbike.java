package net.braniumacademy.l44.ex2;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public float getKmPerCharge() {
        return kmPerCharge;
    }

    public void setKmPerCharge(float kmPerCharge) {
        this.kmPerCharge = kmPerCharge;
    }

    public float getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(float chargingTime) {
        this.chargingTime = chargingTime;
    }

    public float getChargingVoltage() {
        return chargingVoltage;
    }

    public void setChargingVoltage(float chargingVoltage) {
        this.chargingVoltage = chargingVoltage;
    }
}
