package net.braniumacademy.l44.ex1;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMainFood() {
        return mainFood;
    }

    public void setMainFood(String mainFood) {
        this.mainFood = mainFood;
    }

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }
}
