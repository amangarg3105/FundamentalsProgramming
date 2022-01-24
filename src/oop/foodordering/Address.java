package oop.foodordering;


public class Address {

    private int zipCode;
    private String city;
    private String state;
    private String landMark;
    private byte street;

    public Address(int zipCode, String city, String state, String landMark, byte street) {
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.landMark = landMark;
        this.street = street;
    }

    public Address(int zipCode, String city) {
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public byte getStreet() {
        return street;
    }

    public void setStreet(byte street) {
        this.street = street;
    }
}
