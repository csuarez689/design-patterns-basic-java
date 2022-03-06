/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.command;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        ICommand lightsOn = new LightOnCommand(light);
        ICommand lightsOff = new LightOffCommand(light);

        //on
        control.setCommand(lightsOn);
        control.pressButton();

        //off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
