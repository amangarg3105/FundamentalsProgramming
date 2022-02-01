package doubts;


import oop.doubts.RegularTicket;
import oop.doubts.Ticket;

import java.util.Random;

public class Passenger {


    Contact contact;


    private Ticket ticket;


    private int passengerId;

    private static int idCounter;


    //Passenger this = new Passenger
    public Passenger(double phoneNumber, String email, int ticketType) {
        this.passengerId = idCounter;
        idCounter++;

        Contact contact = new Contact(this, email, phoneNumber);
        this.contact = contact;

        //Create ticket
        if(ticketType == 1) {
            //create Regular Ticket
            //create PNR
            String pnr = createPnr();
            Ticket ticket = new RegularTicket(pnr);
            this.ticket = ticket;
        }
    }

    public Ticket getTicket() {
        return ticket;
    }

    private String createPnr() {

        String pnr =  "";
        Random rand = new Random();
        for(int index = 0; index < 6; index++) {
           int randomNumber = rand.nextInt(9);
           String number = String.valueOf(randomNumber);
           pnr = pnr + number;
        }
        return pnr;
    }
}
