package oop.polymorhism;

public class Human {


    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.speak();
        dog.speak();
    }
}
