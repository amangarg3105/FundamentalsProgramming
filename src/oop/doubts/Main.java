package oop.doubts;


public class Main {


    public static void main(String[] args) {

        RegularTicket ticket = new RegularTicket("xyzTicket");
        ticket.printTicketName();
        printTicket(ticket);

        int [] arr = new int [5];


    }


    public static void printTicket(Ticket ticket) {
            ticket.printPNR();
    }
}
