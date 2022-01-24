package oop.interfaces;

/**
 * @author amgarg
 */
public class Manufacturer {

    public static void main(String[] args) {

        Mobile mobile = new Samsung();

        mobile.shouldCall();

        System.out.println(Mobile.a);
    }
}
