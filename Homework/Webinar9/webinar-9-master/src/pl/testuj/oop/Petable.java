package pl.testuj.oop;

public interface Petable {
    void pet();

    default void printMsg() {
        System.out.println("Domyślna implementacja");
    }
}
