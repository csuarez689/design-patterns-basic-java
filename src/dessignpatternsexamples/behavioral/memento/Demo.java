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
        textEditor.save(textWindow.save()); //generates 1st snapshot
        textWindow.write("Line 3\n");
        textWindow.write("Line 4\n");
        textEditor.save(textWindow.save()); //generates 2nd snapshot
        textWindow.write("Line 5\n");
        textWindow.write("Line 6\n");
        textEditor.save(textWindow.save()); //generates 3rd snapshot

        textWindow.print();
        System.out.println("##############################################");
        textWindow.restore(textEditor.getStateBySnapshotIndex(1)); //back to 2nd snapshot

        textWindow.print();
        System.out.println("##############################################");
        textWindow.restore(textEditor.getStateBySnapshotIndex(0)); //back to 1st snapshot

        textWindow.print();
        System.out.println("##############################################");
        textWindow.restore(textEditor.getStateBySnapshotIndex(2)); //forward to 3nd snapshot

        textWindow.print();

    }
}
