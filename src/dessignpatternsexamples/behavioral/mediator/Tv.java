/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.mediator;

/**
 *
 * @author Claudio
 */
public class Tv {

    private Mediator mediator;
    private boolean isOn;

    public Tv(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    public boolean isOn() {
        return this.isOn;
    }
}
