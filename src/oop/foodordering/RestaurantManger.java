package oop.foodordering;


import java.util.Scanner;

public class RestaurantManger {

   private Restaurant [] restaurants;

   static int restaurantsCount;

    public RestaurantManger() {
        this.restaurants = new Restaurant[100];
    }

    public void createRestaurant() {

        System.out.println("Creating Restaurant");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter restaurantName");
        String name = sc.nextLine();

        System.out.println("Please enter address");
        Address address = createAddress();

        System.out.println("Thanks for adding these details, " +
                "Please add your menu");

        Food [] foods = createFoodMenu();
        long id = (long) Math.random();
        Restaurant restaurant = new Restaurant(name, id, address, foods, false);
        restaurants[restaurantsCount] = restaurant;
        restaurantsCount++;
    }

    private Address createAddress() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter zipcode");

        int zipcode = sc.nextInt();

        System.out.println("Please enter city");
        String city = sc.next();

        Address address = new Address(zipcode, city);

        return address;

    }

    private Food[] createFoodMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many foodItems you want to add");
        int count = sc.nextInt();

        if(count > 20) {
            System.out.println("Sorry not supported");
            return null;
        }

        Food foods[] = new Food[count];

        for(int i = 0; i < count; i++) {
            System.out.println("Please enter foodName");
            String foodName = sc.next();

            System.out.println("Please enter foodType, type V or N");
            String foodType = sc.next();

            System.out.println("Please enter foodPrice");
            double foodPrice = sc.nextDouble();

            System.out.println("Thanks for adding these items");

            Food food = new Food(foodType.charAt(0), foodPrice, foodName);

            foods[i] = food;
        }
        return foods;
    }

    public Restaurant[] getRestaurants() {
        return restaurants;
    }
}
