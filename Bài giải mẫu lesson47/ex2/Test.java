package net.braniumacademy.l47.ex2;

public class Test {
    public static void main(String[] args) {
        // tạo một số đối tượng demo
        Vehicle audi = new Car();
        audi.setBrand("Audi");
        audi.startEngine();
        audi.speedUp();
        System.out.println("=========================");
        Vehicle truck = new Truck();
        truck.setBrand("THACO");
        truck.startEngine();
        truck.brake();
        truck.stopEngine();
        System.out.println("=========================");
        Vehicle eMotobike = new Electricbike();
        eMotobike.setBrand("Vinfast");
        eMotobike.startEngine();
        eMotobike.speedUp();
        eMotobike.brake();
    }
}
