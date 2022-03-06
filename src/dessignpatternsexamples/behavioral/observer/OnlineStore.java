/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Claudio
 */
public class OnlineStore {

    private List<IObserver> observers = new ArrayList<>();

    private boolean isArrived;

    public void addListener(IObserver o) {
        observers.add(o);
    }

    public boolean isArrived() {
        return isArrived;
    }

    public void setState(boolean isArrived) {
        this.isArrived = isArrived;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
