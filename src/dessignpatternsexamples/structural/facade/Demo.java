/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.facade;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        List<TravelRoute> travelRoutes = travelFacade.getTravelRoutes(new Date(), new Date());

        if (travelFacade != null && travelRoutes.size() > 0) {
            travelFacade.bookTravelRoute(travelRoutes.get(0));
        }
    }
}
