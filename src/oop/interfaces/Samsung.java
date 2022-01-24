package oop.interfaces;


/**
 * Samsung is using mobile contract
 */
public class Samsung implements  Mobile{


    public void shouldCall() {

        System.out.println("Hi, Samsung will support calls");
    }


    public void shouldOpenCamera() {
        System.out.println("Hi, Samsung will open camera");
    }


    public void shouldSupport5G() {
        System.out.println("Hi, Samsung will not support 5g for now");
    }
}
