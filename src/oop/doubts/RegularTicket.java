package oop.doubts;


public class RegularTicket extends  Ticket {

    RegularTicket(String ticketName) {
        super(ticketName);
    }

    @Override
    void printPNR() {
        System.out.println("Printing PNR from regular ticket");
    }

    public void printTicketName() {
        System.out.println(ticketName);
    }
}
