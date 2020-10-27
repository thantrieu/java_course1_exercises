package net.braniumacademy.l44.ex1;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getBirthForm() {
        return birthForm;
    }

    public void setBirthForm(String birthForm) {
        this.birthForm = birthForm;
    }
}
