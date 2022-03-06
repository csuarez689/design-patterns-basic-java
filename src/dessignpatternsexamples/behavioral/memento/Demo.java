/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.memento;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextWindow textWindow = new TextWindow();
        textWindow.write("Line 1\n");
        textWindow.write("Line 2\n");
        textEditor.save(textWindow.save());
        textWindow.write("Line 3\n");
        textWindow.write("Line 4\n");
        textEditor.save(textWindow.save());
        textWindow.write("Line 5\n");
        textWindow.write("Line 6\n");
        textEditor.save(textWindow.save());

        textWindow.print();
        System.out.println("##############################################");
        textWindow.restore(textEditor.getStateBySnapshotIndex(1));

        textWindow.print();
        System.out.println("##############################################");
        textWindow.restore(textEditor.getStateBySnapshotIndex(0));

        textWindow.print();
        System.out.println("##############################################");
        textWindow.restore(textEditor.getStateBySnapshotIndex(2));

        textWindow.print();

    }
}
