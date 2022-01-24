package oop.inheritence.multiple;


public interface I1 {

    default void display() {
        System.out.println("Calling display from I1");
    }
}
