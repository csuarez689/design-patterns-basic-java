/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.singleton;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        var orderManagementService1 = OrderManagementService.getInstance();
        var orderManagementService2 = OrderManagementService.getInstance();

        //var orderManagementService3=new OrderManagementService();
        System.out.println(orderManagementService1 == orderManagementService2);
        orderManagementService1.placeOrder();

    }
}
