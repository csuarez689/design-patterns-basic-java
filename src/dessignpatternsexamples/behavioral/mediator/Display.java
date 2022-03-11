/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.mediator;

/**
 *
 * @author Claudio
 */
public class Display {

    private Mediator mediator;

    public Display(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {
        System.out.println("Display is turned on");
    }

    public void turnOff() {
        System.out.println("Display is turned off");
    }
}
