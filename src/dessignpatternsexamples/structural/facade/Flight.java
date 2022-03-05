/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.facade;

import java.util.Date;

/**
 *
 * @author Claudio
 */
public class Flight {

    private String flightNumber;
    private String airportFrom;
    private String airportTo;
    private Date departureDateTime;

    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * @return the airportFrom
     */
    public String getAirportFrom() {
        return airportFrom;
    }

    /**
     * @param airportFrom the airportFrom to set
     */
    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    /**
     * @return the airportTo
     */
    public String getAirportTo() {
        return airportTo;
    }

    /**
     * @param airportTo the airportTo to set
     */
    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    /**
     * @return the departureDateTime
     */
    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * @param departureDateTime the departureDateTime to set
     */
    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

}
