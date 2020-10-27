package net.braniumacademy.l44.ex1;

public class Fish extends Animal {
    private String color;
    private String food;

    public Fish() {
    }

    public Fish(String color, String food) {
        this.color = color;
        this.food = food;
    }

    public Fish(String name, String species, float height,
                float weight, String habitat, String birthForm,
                String color, String food) {
        super(name, species, height, weight, habitat, birthForm);
        this.color = color;
        this.food = food;
    }

    public void swimm() { // bơi
        System.out.println(getName() + " đang bơi...");
    }

    public void dive() { // lặn
        System.out.println(getName() + " đang lặn...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
