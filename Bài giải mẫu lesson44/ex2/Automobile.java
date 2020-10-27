package net.braniumacademy.l44.ex2;

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

    public int getNumOfWheel() {
        return numOfWheel;
    }

    public void setNumOfWheel(int numOfWheel) {
        this.numOfWheel = numOfWheel;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }
}
