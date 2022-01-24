package oop;

/**
 * @author amgarg
 */
class Animal {

    String animalName;

    int age = 3;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {


    int age = 4;

    public Dog(String animalName) {
        //Using super to invoke parent class constructor
        super(animalName);
    }

    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        //Using super to invoke parent class eat method
        super.eat();
        bark();

        //Using super to invoke parent class age variable
        System.out.println(super.age);
    }
}

class Zoo {
    public static void main(String args[]) {
        Dog d = new Dog("SherU");
        d.work();
    }
}