package oop.inheritence.hybrid.main;

import oop.inheritence.hybrid.Dog;

public class Puppy extends Dog {


     Puppy() {
        super("Parent");
    }
    //public String dogName;
     String dogName;

    public void printName() {

        System.out.println(super.dogName);
        System.out.println(dogName);
    }

    public void setDogName() {
        System.out.println(dogName);
    }
}
