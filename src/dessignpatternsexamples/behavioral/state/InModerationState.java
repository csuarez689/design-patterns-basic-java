/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.state;

/**
 *
 * @author Claudio
 */
public class InModerationState extends DocumentState {

    public static final String ADMIN_ROLE = "ADMIN_ROLE";
    public static final String NORMAL_ROLE = "NORMAL_ROLE";

    public InModerationState(Document document) {
        super(document);
    }

    @Override
    public void publish(User user) {
        if (user.getRoleName().equals(ADMIN_ROLE)) {
            document.setState(new PublishedState(document));
            document.setModeratedByNickname(user.getNickname());
            document.setPublishedByNickname(user.getNickname());
            System.out.println("Document is published");
        } else {
            System.out.println("You are not admin and can't publish content.");
        }
    }

    @Override
    public String toString() {
        return "In Moderation State";
    }
}
