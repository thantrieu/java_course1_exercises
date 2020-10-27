package net.braniumacademy.l47.ex1;

public class Test {
    public static void main(String[] args) {
        // tạo một số đối tượng đơn giản và cho thực hiện hành động
        Animal fish = new Fish();
        fish.setName("Peogeos");
        fish.move();
        System.out.println("=======================");
        Animal bird = new Bird();
        bird.setName("Trickky");
        bird.eat();
        System.out.println("=======================");
        Animal cat = new Mammal();
        cat.setName("Meow");
        cat.relax();
    }
}
