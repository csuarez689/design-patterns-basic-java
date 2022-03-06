/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.state;

/**
 *
 * @author Claudio
 */
public class User {

    private String roleName;
    private String nickname;

    public User(String roleName, String nickname) {
        this.roleName = roleName;
        this.nickname = nickname;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String getNickname() {
        return this.nickname;
    }
}
