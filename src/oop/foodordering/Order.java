package oop.foodordering;


public class Order {

    private long orderId;

    private String orderStatus;

    private Cart cart;

    private User user;

    public Order(long orderId, String orderStatus, Cart cart, User user) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.cart = cart;
        this.user = user;
    }

    public long getOrderId() {
        return orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Cart getCart() {
        return cart;
    }

    public User getUser() {
        return user;
    }
}
