/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.abstractfactory.example1;

/**
 *
 * @author Claudio
 */
public class MacOsWidgetFactory implements IAbstractWidgetFactory {

    @Override
    public IWindow createWindow() {
        return new MacOsWindow();
    }

    @Override
    public Scroll createScroll() {
        return new MacOsScroll();
    }

    @Override
    public Button[] createNavigationButtons() {
        Button[] buttons = {
            new MacOsButton("close window"),
            new MacOsButton("expand window"),
            new MacOsButton("next"),
            new MacOsButton("back")
        };
        return buttons;
    }

}
