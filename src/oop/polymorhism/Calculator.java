package oop.polymorhism;


public class Calculator {


    public void add(int a, int b) {
        System.out.println("Hi from two arguments");
    }

    public void add(int a, float b) {
        System.out.println("Hi from two arguments with one of them as float");
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(3,4 );
        calculator.add(3, 4.0f);
    }
}
