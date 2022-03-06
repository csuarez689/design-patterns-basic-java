/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.state;

/**
 *
 * @author Claudio
 */
public class Document {

    private IState state;
    private String createdByNickname;
    private String moderatedByNickname;
    private String publishedByNickname;

    public Document() {
        this.state = new DraftState(this);
    }

    public void publish(User user) {
        this.state.publish(user);
    }

    public void printStatus() {
        System.out.println("===== Document Status =====");
        System.out.println("Created by: " + this.createdByNickname);
        System.out.println("Moderated by: " + this.moderatedByNickname);
        System.out.println("Published by: " + this.publishedByNickname);
        System.out.println("State: " + this.state.toString());
        System.out.println("============================");

    }

    /**
     * @param state the state to set
     */
    public void setState(IState state) {
        this.state = state;
    }

    /**
     * @param createdByNickname the createdByNickname to set
     */
    public void setCreatedByNickname(String createdByNickname) {
        this.createdByNickname = createdByNickname;
    }

    /**
     * @param moderatedByNickname the moderatedByNickname to set
     */
    public void setModeratedByNickname(String moderatedByNickname) {
        this.moderatedByNickname = moderatedByNickname;
    }

    /**
     * @param publishedByNickname the publishedByNickname to set
     */
    public void setPublishedByNickname(String publishedByNickname) {
        this.publishedByNickname = publishedByNickname;
    }

}
