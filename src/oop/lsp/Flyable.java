package oop.lsp;

// An interface for objects that can fly. It extends Movable,
// since anything that can fly must also be able to move.
public interface Flyable extends moveable {
    void fly();
}