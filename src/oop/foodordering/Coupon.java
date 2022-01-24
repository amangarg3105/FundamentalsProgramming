package oop.foodordering;


public class Coupon {


    private long couponId;

    private String couponCode;

    private String description;

    public Coupon(long couponId, String couponCode, String description) {
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.description = description;
    }

    public long getCouponId() {
        return couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public String getDescription() {
        return description;
    }
}
