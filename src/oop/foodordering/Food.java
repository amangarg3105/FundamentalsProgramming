package oop.foodordering;


public class Food {


    private long foodId;
    private char foodType;
    private double price;
    private Restaurant restaurant;
    private String foodName;

    public Food(char foodType,
                double price, String foodName) {

        this.foodType = foodType;
        this.price = price;
        this.foodName = foodName;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setFoodId(long foodId) {
        this.foodId = foodId;
    }

    public long getFoodId() {
        return foodId;
    }

    public char getFoodType() {
        return foodType;
    }

    public double getPrice() {
        return price;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String getFoodName() {
        return foodName;
    }
}
