/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.abstractfactory.example1;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        GUIBuilder builder = new GUIBuilder();

        IAbstractWidgetFactory widgetFactory = null;

        //check platform
        String platform = "MACOSX";
        if (platform.equals("MACOSX")) {
            widgetFactory = new MacOsWidgetFactory();
        } else {
            widgetFactory = new MSWidgetFactory();
        }

        builder.buildWindow(widgetFactory);
    }
}
