package net.braniumacademy.l47.ex1;

public class Bird extends Animal {
    private String color;
    private String mainFood;
    private float wingspan;

    public Bird() {
    }

    public Bird(String color, String mainFood, float wingspan) {
        this.color = color;
        this.mainFood = mainFood;
        this.wingspan = wingspan;
    }

    public Bird(String name, String species, float height,
                float weight, String habitat, String birthForm,
                String color, String mainFood, float wingspan) {
        super(name, species, height, weight, habitat, birthForm);
        this.color = color;
        this.mainFood = mainFood;
        this.wingspan = wingspan;
    }

    public void chatter() { // chim hót
        System.out.println(getName() + " đang hót líu lo...");
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getMainFood() {
        return mainFood;
    }

    public final void setMainFood(String mainFood) {
        this.mainFood = mainFood;
    }

    public final float getWingspan() {
        return wingspan;
    }

    public final void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    // override phương thức của lớp cha

    @Override
    public void eat() {
        System.out.println("Override lại phương thức eat() trong lớp Bird");
        System.out.println("Chim có loài ăn thực vật, " +
                "có loài ăn động vật, có loài ăn tạp");
    }

    @Override
    public void sleep() {
        System.out.println("Override lại phương thức sleep() trong lớp Bird");
    }

    @Override
    public void move() {
        System.out.println("Override lại phương thức move() trong lớp Bird");
    }

    @Override
    public void relax() {
        System.out.println("Override lại phương thức relax() trong lớp Bird");
    }
}
