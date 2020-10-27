package net.braniumacademy.l44.ex2;

public class Vehicle {
    private String brand;   // hãng
    private int year;       // năm sản xuất
    private String madeIn;  // nơi sản xuất
    private float price;    // giá
    private String size;    // kích thước
    private float weight;   // trọng lượng
    private String lisensePlate; // biển số

    public Vehicle() {
    }

    public Vehicle(String brand, int year, String madeIn,
                   float price, String size, float weight,
                   String lisensePlate) {
        this.brand = brand;
        this.year = year;
        this.madeIn = madeIn;
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.lisensePlate = lisensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getLisensePlate() {
        return lisensePlate;
    }

    public void setLisensePlate(String lisensePlate) {
        this.lisensePlate = lisensePlate;
    }
}
