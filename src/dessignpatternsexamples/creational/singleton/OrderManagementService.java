/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.singleton;

/**
 *
 * @author Claudio
 */
public class OrderManagementService {

    private static OrderManagementService instance;

    private OrderManagementService() {
    }

    public static synchronized OrderManagementService getInstance() {
        if (instance == null) {
            instance = new OrderManagementService();
        }
        return instance;
    }

    public void placeOrder() {
        System.out.println("Place order method is invoked");
    }

}
