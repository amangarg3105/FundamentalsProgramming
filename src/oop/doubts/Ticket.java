package oop.doubts;


public abstract class Ticket {

    String ticketName;

    Ticket(String ticketName) {
        this.ticketName = ticketName;
    }

    abstract void printPNR();
}
