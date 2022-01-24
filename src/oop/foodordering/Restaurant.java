package oop.foodordering;


public class Restaurant {


    private String name;
    private long restaurantId;
    private Address address;
    private float rating;
    private Review[] reviews;
    private Food[] foods;
    private boolean isOpen;

    public Restaurant(String name, long restaurantId, Address address,
                    Food[] foods,
                      boolean isOpen) {
        this.name = name;
        this.restaurantId = restaurantId;
        this.address = address;
        this.foods = foods;
        this.isOpen = isOpen;
    }



    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getName() {
        return name;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public Address getAddress() {
        return address;
    }

    public float getRating() {
        return rating;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public Food[] getFoods() {
        return foods;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
