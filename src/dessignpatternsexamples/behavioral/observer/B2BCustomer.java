/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.observer;

/**
 *
 * @author Claudio
 */
public class B2BCustomer implements IObserver {

    public B2BCustomer(OnlineStore onlineStore) {
        onlineStore.addListener(this);
    }

    public void update() {
        System.out.println("Products arrived to the store. Make your B2B order now");
    }
}
