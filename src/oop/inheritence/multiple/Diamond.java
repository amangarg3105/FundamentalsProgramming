package oop.inheritence.multiple;


public class Diamond implements I1, I2 {

    public void display() {
        I1.super.display();
        I2.super.display();
    }
}
