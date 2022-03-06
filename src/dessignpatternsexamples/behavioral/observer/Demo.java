/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.observer;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        new B2CCustomer(store);
        new B2BCustomer(store);
        new B2CCustomer(store);
        new B2BCustomer(store);

        Scanner input = new Scanner(System.in);
        boolean isArrived = false;
        while (!isArrived) {
            System.out.println("Have new products arrived?");
            isArrived = input.nextBoolean();
        }
        store.setState(isArrived);
    }
}
