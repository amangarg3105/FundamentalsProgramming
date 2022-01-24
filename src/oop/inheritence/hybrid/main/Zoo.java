package oop.inheritence.hybrid.main;


import oop.inheritence.hybrid.Dog;

public class Zoo {

    public static void main(String[] args) {

        Puppy puppy = new Puppy();

        puppy.dogName = "Puppy";

        puppy.printName();

        Dog dog = new Dog("Dog");

    }
}
