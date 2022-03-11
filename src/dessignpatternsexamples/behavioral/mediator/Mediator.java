/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.mediator;

/**
 *
 * @author Claudio
 */
public class Mediator {

    private Tv tv;
    private Display display;

    public void press() {
        if (tv.isOn()) {
            tv.turnOff();
        } else {
            tv.turnOn();
        }
    }

    public void start() {
        display.turnOn();
    }

    public void stop() {
        display.turnOff();
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public void setPowerDisplay(Display display) {
        this.display = display;
    }
}
