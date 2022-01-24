package oop.foodordering;


public class User {

    protected long userId;
    protected String userName;
    protected long contactNumber;
    protected String email;

    public User(long userId, String userName, long contactNumber, String email) {
        this.userId = userId;
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

}
