package oop.inheritence.multilevel;


public class Puppy extends Dog {

    public String name;

    public Puppy(String name) {
        super("Sheru");
        System.out.println("Creating Puppy");
    }

    public void weep() {
        System.out.println(super.name);
        System.out.println("Weeping...");
    }
}
