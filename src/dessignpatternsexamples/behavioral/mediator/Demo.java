/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.mediator;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        var tv = new Tv(mediator);
        var remoteControlButton = new Button(mediator);
        var display = new Display(mediator);

        mediator.setTv(tv);
        mediator.setPowerDisplay(display);

        System.out.println("fan.isOn(): " + tv.isOn());

        remoteControlButton.press();
        System.out.println("fan.isOn(): " + tv.isOn());

        remoteControlButton.press();
        System.out.println("fan.isOn(): " + tv.isOn());
    }
}
