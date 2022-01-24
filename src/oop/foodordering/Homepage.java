package oop.foodordering;


import java.util.Scanner;

public class Homepage {


    public static void main(String[] args) {

        System.out.println("Please enter your role");

        Scanner sc = new Scanner(System.in);

        int role = sc.nextInt();
        RestaurantManger restaurantManger = new RestaurantManger();

        if(role == 1) {
            //Restaurant role

            restaurantManger.createRestaurant();

            Restaurant[] restaurants =
                    restaurantManger.getRestaurants();

            for(int i = 0; i < restaurants.length; i++) {
                Restaurant currentRestaurant = restaurants[i];
                System.out.println(currentRestaurant.getName());
            }
        } else if(role == 2) {
            CustomerManger customerManger = new CustomerManger();
            //Update
        } else if(role == 3) {
            //getAll restaurants
        }


    }
}
