/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.abstractfactory.example1;

/**
 *
 * @author Claudio
 */
public class MacOsWindow implements IWindow {

    @Override
    public void repaint() {
        // Mac OSX specific behaviour
    }

    @Override
    public void setTitle(final String text) {
    }

}
