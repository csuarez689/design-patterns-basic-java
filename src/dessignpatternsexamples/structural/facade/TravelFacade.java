/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.facade;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Claudio
 */
public class TravelFacade {

    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    {
        hotelBooker = new HotelBooker();
        flightBooker = new FlightBooker();
    }

    public List<TravelRoute> getTravelRoutes(Date from, Date to) {
        List<Flight> flights = flightBooker.getFlightsFor(from, to);
        List<Hotel> hotels = hotelBooker.getHotelsFor(from, to);
        //process query and data
        return Collections.emptyList();
    }

    public void bookTravelRoute(TravelRoute travelRoute) {
        hotelBooker.bookHotel(travelRoute.getHotel());
        flightBooker.bookFlight(travelRoute.getFlight());
    }
}
