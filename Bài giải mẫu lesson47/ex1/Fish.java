package net.braniumacademy.l47.ex1;

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

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getFood() {
        return food;
    }

    public final void setFood(String food) {
        this.food = food;
    }

    @Override
    public void eat() {
        super.eat(); // gọi phương thức nguyên bản của lớp cha
        System.out.println("Override lại phương thức eat() trong lớp Fish");
    }

    @Override
    public void sleep() {
        super.sleep(); // gọi phương thức nguyên bản của lớp cha
        System.out.println("Override lại phương thức sleep() trong lớp Fish");
    }

    @Override
    public void move() {
        super.move(); // gọi phương thức nguyên bản của lớp cha
        System.out.println("Override lại phương thức move() trong lớp Fish");
    }

    @Override
    public void relax() {
        super.relax(); // gọi phương thức nguyên bản của lớp cha
        System.out.println("Override lại phương thức relax() trong lớp Fish");
    }
}
