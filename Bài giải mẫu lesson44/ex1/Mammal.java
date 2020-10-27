package net.braniumacademy.l44.ex1;

public class Mammal extends Animal {
    private int numOfLeg;
    private String color;
    private int numOfTeeth;
    private String behavior;

    public Mammal() {
    }

    public Mammal(int numOfLeg, String color,
                  int numOfTeeth, String behavior) {
        this.numOfLeg = numOfLeg;
        this.color = color;
        this.numOfTeeth = numOfTeeth;
        this.behavior = behavior;
    }

    public Mammal(String name, String species, float height,
                  float weight, String habitat, String birthForm,
                  int numOfLeg, String color, int numOfTeeth, String behavior) {
        super(name, species, height, weight, habitat, birthForm);
        this.numOfLeg = numOfLeg;
        this.color = color;
        this.numOfTeeth = numOfTeeth;
        this.behavior = behavior;
    }

    public void makeFood() {
        System.out.println(getName() + " đang làm món ăn...");
    }

    public int getNumOfLeg() {
        return numOfLeg;
    }

    public void setNumOfLeg(int numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfTeeth() {
        return numOfTeeth;
    }

    public void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
}
