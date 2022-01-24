package oop.foodordering;


public class Review {

    private User user;

    private String reviewText;

    public Review(User user, String reviewText) {
        this.user = user;
        this.reviewText = reviewText;
    }

    public User getUser() {
        return user;
    }

    public String getReviewText() {
        return reviewText;
    }
}
