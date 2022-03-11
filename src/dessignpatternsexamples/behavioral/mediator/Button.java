/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.mediator;

/**
 *
 * @author Claudio
 */
public class Button {

    private Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }
}
