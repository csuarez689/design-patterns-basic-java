/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.state;

/**
 *
 * @author Claudio
 */
public class PublishedState extends DocumentState {

    public PublishedState(Document document) {
        super(document);
    }

    @Override
    public void publish(User user) {
        System.out.println("Document is already published.");
    }

    @Override
    public String toString() {
        return "Published State";
    }
}
