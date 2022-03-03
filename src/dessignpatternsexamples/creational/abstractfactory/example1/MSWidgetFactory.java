/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.abstractfactory.example1;

/**
 *
 * @author Claudio
 */
public class MSWidgetFactory implements IAbstractWidgetFactory {

    @Override
    public IWindow createWindow() {
        return new MSWindow();
    }

    @Override
    public Scroll createScroll() {
        return new MSScroll();
    }

    @Override
    public Button[] createNavigationButtons() {
        Button[] buttons = {
            new MSButton("close window"),
            new MSButton("expand window"),
            new MSButton("next"),
            new MSButton("back")
        };
        return buttons;
    }

}
