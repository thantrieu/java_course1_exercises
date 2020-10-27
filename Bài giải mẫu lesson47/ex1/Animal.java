package net.braniumacademy.l47.ex1;

public class Animal {
    private String name;        // tên
    private String species;     // loài
    private float height;       // chiều cao
    private float weight;       // cân nặng
    private String habitat;     // môi trường sống
    private String birthForm;   // hình thức sinh sản

    public Animal() {
    }

    public Animal(String name, String species, float height,
                  float weight, String habitat, String birthForm) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.habitat = habitat;
        this.birthForm = birthForm;
    }

    public void eat() {
        System.out.println(name + " đang ăn...");
    }

    public void sleep() {
        System.out.println(name + " đang ngủ...");
    }

    public void move() {
        System.out.println(name + " đang di chuyển...");
    }

    public void relax() {
        System.out.println(name + " đang nghỉ ngơi...");
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getSpecies() {
        return species;
    }

    public final void setSpecies(String species) {
        this.species = species;
    }

    public final float getHeight() {
        return height;
    }

    public final void setHeight(float height) {
        this.height = height;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public final String getBirthForm() {
        return birthForm;
    }

    public final void setBirthForm(String birthForm) {
        this.birthForm = birthForm;
    }
}
