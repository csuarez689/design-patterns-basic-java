/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dessignpatternsexamples.creational.abstractfactory.example1;

/**
 *
 * @author Claudio
 */
public interface IAbstractWidgetFactory {

    public IWindow createWindow();

    public Scroll createScroll();

    public Button[] createNavigationButtons();
}
