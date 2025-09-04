package oop.lsp;

// An Ostrich is a Movable bird, but not Flyable.
// It adheres to LSP by not implementing the fly() method,
// as it cannot fly.
public class Ostrich implements moveable {
    @Override
    public void move() {
        System.out.println("Ostrich is running quickly.");
    }
}