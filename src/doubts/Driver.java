package doubts;

import oop.doubts.RegularTicket;
import oop.doubts.Ticket;

/**
 * @author amgarg
 */
public class Driver {


    public static void main(String[] args) {

        Tyre tyre = new Tyre("MRF");

        Car car = new Car(tyre);
        car.printTyreNameOfCar();

        Passenger passenger = new Passenger(1234456790,
                "xyzz@gmail.com", 1);

        Ticket passengerTicket = passenger.getTicket();
        printTicketDetails(passengerTicket);

        /**
         * Create passenger
         *
         */

    }



    // Ticket ticket = new RegularTicket("1234X1");
    public static void printTicketDetails(Ticket ticket) {


        ticket.printTicketDetails();


    }



}
