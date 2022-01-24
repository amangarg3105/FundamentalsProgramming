package oop.inheritence.multilevel;


public class Dog extends Animal {

    public String name;

    Dog(String name) {
        this.name = name;
        System.out.println("Creating Dog");
    }

    public void bark() {
        System.out.println("Barking");
    }

}
