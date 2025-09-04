package oop.lsp;

// A Penguin is a Movable bird, but not Flyable.
// This design avoids the classic LSP violation of a "flying bird"
// that throws an exception when fly() is called.
public class Penguin implements moveable {
    @Override
    public void move() {
        System.out.println("Penguin is waddling on land.");
    }
}