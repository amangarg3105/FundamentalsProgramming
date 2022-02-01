package doubts;


public class Contact {


    Passenger passenger;

    String email;

    double phoneNumber;


    public Contact(Passenger passenger, String email, double phoneNumber) {
        this.passenger = passenger;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public Passenger getPassenger(String contactNumber) {
        return  passenger;
    }
}
