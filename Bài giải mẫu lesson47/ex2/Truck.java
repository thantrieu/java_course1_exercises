package net.braniumacademy.l47.ex2;

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

    // ghi đè các phương thức của lớp cha
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Xe tải khởi động bằng tay");
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
        System.out.println("Xe tải tắt máy bằng vặn chìa khóa");
    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Xe tả tăng tốc bằng đạp ga");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Xe tải phanh bằng phanh chân");
    }

    @Override
    public void turnLight() {
        super.turnLight();
        System.out.println("Xe tải bật đèn bằng công tắc");
    }

    public final float getPayload() {
        return payload;
    }

    public final void setPayload(float payload) {
        this.payload = payload;
    }

    public final String getPurpose() {
        return purpose;
    }

    public final void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public final float getShippedAmount() {
        return shippedAmount;
    }

    public final void setShippedAmount(float shippedAmount) {
        this.shippedAmount = shippedAmount;
    }
}
