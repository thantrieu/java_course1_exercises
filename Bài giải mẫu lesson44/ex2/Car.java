package net.braniumacademy.l44.ex2;

public class Car extends Automobile {
    private int numOfDoor; // số cửa
    private int numOfSeat; // số ghế ngồi
    private String category; // loại xe
    private String driveForm; // tìm thêm trên gg search please
    private String typeOfEnergy; // loại động cơ

    public Car() {
    }

    public Car(int numOfDoor, int numOfSeat, String category,
               String driveForm, String typeOfEnergy) {
        this.numOfDoor = numOfDoor;
        this.numOfSeat = numOfSeat;
        this.category = category;
        this.driveForm = driveForm;
        this.typeOfEnergy = typeOfEnergy;
    }

    public Car(int numOfWheel, String engineType, String name,
               String color, Owner owner, int numOfDoor, int numOfSeat,
               String category, String driveForm, String typeOfEnergy) {
        super(numOfWheel, engineType, name, color, owner);
        this.numOfDoor = numOfDoor;
        this.numOfSeat = numOfSeat;
        this.category = category;
        this.driveForm = driveForm;
        this.typeOfEnergy = typeOfEnergy;
    }

    public int getNumOfDoor() {
        return numOfDoor;
    }

    public void setNumOfDoor(int numOfDoor) {
        this.numOfDoor = numOfDoor;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDriveForm() {
        return driveForm;
    }

    public void setDriveForm(String driveForm) {
        this.driveForm = driveForm;
    }

    public String getTypeOfEnergy() {
        return typeOfEnergy;
    }

    public void setTypeOfEnergy(String typeOfEnergy) {
        this.typeOfEnergy = typeOfEnergy;
    }
}
