package ru.dzalba.service;

import ru.dzalba.model.Flight;

import java.util.List;

public interface FlightsFilter {

    List<Flight> buildFlight();

    FlightsFilter departureBeforeNow();

    FlightsFilter arriveBeforeDeparture();

    FlightsFilter moreThanTwoHoursOnTheGround();
}
