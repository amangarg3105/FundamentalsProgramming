package oop.foodordering;


public class Customer extends  User {


    private Cart cart;

    public Customer(long userId, String userName,
                    long contactNumber,
                    String email) {
        super(userId, userName, contactNumber, email);
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
