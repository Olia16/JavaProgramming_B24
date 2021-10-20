package day50_inheritance;

public class Airport {

    public static void main(String[] args) {

        FlightTicket flightTicket = new FlightTicket("first", "Newark", "Miami");
        System.out.println(flightTicket.getType());
        System.out.println(flightTicket.getDepartureLocation());
        System.out.println(flightTicket.getArrivalLocation());

    }
}
