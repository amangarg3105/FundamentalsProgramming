package oop.doubts;


public class RegularTicket extends  Ticket {

    public RegularTicket(String pnr) {
        super(pnr);
        ticketName = "Regular Ticket";
    }

    @Override
    public void printPNR() {
        System.out.println(pnr);
    }

    public void printTicketName() {
        System.out.println(ticketName);
    }

    @Override
    public void printTicketDetails()  {
        System.out.println("PNR of ticket is " + pnr);
        System.out.println("Ticket is " + ticketName);
    }


}
