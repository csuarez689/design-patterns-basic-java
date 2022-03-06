/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.memento;

import java.util.ArrayList;

/**
 *
 * @author Claudio
 */
public class TextEditor {

    private ArrayList<TextWindowState> mementos = new ArrayList<>();

    public void save(TextWindowState memento) {
        mementos.add(memento);
    }

    public TextWindowState getStateBySnapshotIndex(int snapshotIndex) {
        return mementos.get(snapshotIndex);
    }
}
