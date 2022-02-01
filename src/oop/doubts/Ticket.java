package oop.doubts;


public abstract class Ticket {

    String ticketName;

    String pnr;


    Ticket(String pnr) {
        this.pnr = pnr;
    }

    public abstract void printPNR();
    public abstract void printTicketDetails();


}
