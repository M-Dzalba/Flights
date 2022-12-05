package ru.dzalba;

import ru.dzalba.model.Flight;
import ru.dzalba.service.FlightBuilder;
import ru.dzalba.service.FlightsFilterImpl;

import java.util.List;

public class FlightsMainClass {
    public static void main(String[] args) {

        List<Flight> flights =FlightBuilder.createFlights();
        List<Flight> flightsDepartureBeforeNow = new FlightsFilterImpl(flights)
                .departureBeforeNow().buildFlight();
        List<Flight> flightsArrivalBeforeDeparture = new FlightsFilterImpl(flights)
                .arriveBeforeDeparture().buildFlight();
        List<Flight> flightsTimeOnGroundMoreThanTwoHours = new FlightsFilterImpl(flights)
                .moreThanTwoHoursOnTheGround().buildFlight();

        System.out.println("All flights:\n" + flights);
        System.out.println("Departure before now:\n" + flightsDepartureBeforeNow);
        System.out.println("Arrival before departure:\n" + flightsArrivalBeforeDeparture);
        System.out.println("Time on the ground is more than two hours:\n" + flightsTimeOnGroundMoreThanTwoHours);
}
}
