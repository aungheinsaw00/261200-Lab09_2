package oop.lsp;

public class Main {
    public static void main(String[] args) {

        // Create different bird types
        moveable penguin = new Penguin();
        moveable ostrich = new Ostrich();
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();

        // Demonstrate polymorphism
        System.out.println("--- Moveable Birds ---");
        penguin.move();
        ostrich.move();
        sparrow.move();  // Flyable is also Moveable
        eagle.move();

        System.out.println("\n--- Flyable Birds ---");
        sparrow.fly();
        eagle.fly();
    }
}