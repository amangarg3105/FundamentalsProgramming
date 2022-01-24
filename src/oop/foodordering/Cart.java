package oop.foodordering;


public class Cart {

    /**
     * Array of food Objects
     */
    private Food[] foods;

    private User user;

    private double amount;

    public Cart(Food[] foods, User user, double amount) {
        this.foods = foods;
        this.user = user;
        this.amount = amount;
    }

    public Food[] getFoods() {
        return foods;
    }

    public User getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }
}
