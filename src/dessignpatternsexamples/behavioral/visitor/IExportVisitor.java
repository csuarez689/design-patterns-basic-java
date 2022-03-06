/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dessignpatternsexamples.behavioral.visitor;

/**
 *
 * @author Claudio
 */
public interface IExportVisitor extends IVisitor {

    public default void export(IGeoElement... elements) {
        for (IGeoElement element : elements) {
            element.accept(this);
        }
    }
}
