/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.memento;

/**
 *
 * @author Claudio
 */
public class TextWindowState {

    private String state;

    public TextWindowState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
