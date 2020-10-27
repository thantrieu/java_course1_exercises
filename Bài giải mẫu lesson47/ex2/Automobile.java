package net.braniumacademy.l47.ex2;

public class Automobile extends Vehicle { // xe ô tô nói chung
    private int numOfWheel; // số bánh xe
    private String engineType; // loại động cơ
    private String name; // tên
    private String color; // màu
    private Owner owner; // chủ sở hữu

    public Automobile() {
    }

    public Automobile(int numOfWheel, String engineType,
                      String name, String color, Owner owner) {
        this.numOfWheel = numOfWheel;
        this.engineType = engineType;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

    @Override
    public void startEngine() {
        super.startEngine(); // gọi phương thức gốc
        System.out.println("Ô tô khởi động bằng công tắc");
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
        System.out.println("Ô tô tắt máy bằng bằng công tắc");
    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Ô tô tăng tốc bằng đạp ga");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Ô tô phanh bằng phanh chân");
    }

    @Override
    public void turnLight() {
        super.turnLight();
        System.out.println("Ô tô bật đèn bằng công tắc");
    }

    public final int getNumOfWheel() {
        return numOfWheel;
    }

    public final void setNumOfWheel(int numOfWheel) {
        this.numOfWheel = numOfWheel;
    }

    public final String getEngineType() {
        return engineType;
    }

    public final void setEngineType(String engineType) {
        this.engineType = engineType;
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

    public final Owner getOwner() {
        return owner;
    }

    public final void setOwner(Owner owner) {
        this.owner = owner;
    }
}

class Owner {
    private String id; // số chứng minh/căn cước
    private String first; // tên
    private String last; // họ
    private String mid; // đệm

    public Owner() {
    }

    public Owner(String id, String first, String last, String mid) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.mid = mid;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final String getFirst() {
        return first;
    }

    public final void setFirst(String first) {
        this.first = first;
    }

    public final String getLast() {
        return last;
    }

    public final void setLast(String last) {
        this.last = last;
    }

    public final String getMid() {
        return mid;
    }

    public final void setMid(String mid) {
        this.mid = mid;
    }
}
