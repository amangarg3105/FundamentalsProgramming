package oop;


public class PassByValue {


    public static void swap(int a, int b) { //a = 5, b = 3

        System.out.println(a + " " + b);
        int c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);

    }


    public  static void giveArray(int [] array) { //array = addres of Array

        System.out.println(array);

        array[0] = 20;

        System.out.println("Printing the array from giveArray function");

        for(int i  = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        swap(a, b);

        System.out.println(a + " " + b);

        int [] array = new int[5];
        array[0] = 10;

        System.out.println(array);

        giveArray(array);

        System.out.println("Printing the array from main function");
        for(int i  = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
