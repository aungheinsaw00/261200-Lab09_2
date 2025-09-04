package oop.lsp;

// A Sparrow is a Flyable bird.
public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Sparrow is Jumping.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying high.");
    }
}