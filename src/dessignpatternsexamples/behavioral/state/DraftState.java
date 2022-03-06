/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.state;

/**
 *
 * @author Claudio
 */
public class DraftState extends DocumentState {

    public DraftState(Document document) {
        super(document);
    }

    @Override
    public void publish(User user) {
        document.setCreatedByNickname(user.getNickname());
        document.setState(new InModerationState(document));
        System.out.println("Document is sent to moderation");
    }

    @Override
    public String toString() {
        return "Draft State";
    }
}
