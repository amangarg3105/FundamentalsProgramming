package oop.inheritence.singlelevel;


import oop.inheritence.singlelevel.Bike;

public class BikeRunner {

    public static void main(String[] args) {

        Bike bike = new Bike(2, 120,
                2);

        System.out.println(bike.numberOfSeats);
       // bike.setRegistrationNumber();
    }
}
