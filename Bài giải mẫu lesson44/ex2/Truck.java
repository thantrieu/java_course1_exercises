package net.braniumacademy.l44.ex2;

public class Truck extends Automobile {
    private float payload; // trọng tải
    private String purpose; // mục đích sử dụng
    private float shippedAmount; // khối lượng hàng hóa đã vận chuyển

    public Truck() {
    }

    public Truck(float payload, String purpose, float shippedAmount) {
        this.payload = payload;
        this.purpose = purpose;
        this.shippedAmount = shippedAmount;
    }

    public Truck(int numOfWheel, String engineType, String name, String color,
                 Owner owner, float payload, String purpose, float shippedAmount) {
        super(numOfWheel, engineType, name, color, owner);
        this.payload = payload;
        this.purpose = purpose;
        this.shippedAmount = shippedAmount;
    }

    public float getPayload() {
        return payload;
    }

    public void setPayload(float payload) {
        this.payload = payload;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public float getShippedAmount() {
        return shippedAmount;
    }

    public void setShippedAmount(float shippedAmount) {
        this.shippedAmount = shippedAmount;
    }
}
