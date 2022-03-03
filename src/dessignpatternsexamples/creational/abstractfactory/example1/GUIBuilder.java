/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.abstractfactory.example1;

/**
 *
 * @author Claudio
 */
public class GUIBuilder {

    public void buildWindow(IAbstractWidgetFactory widgetFactory) {
        IWindow window = widgetFactory.createWindow();
        window.setTitle("New Window");
        widgetFactory.createScroll();
        widgetFactory.createNavigationButtons();
    }
}
