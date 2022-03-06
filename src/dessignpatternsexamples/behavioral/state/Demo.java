/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.state;

import static dessignpatternsexamples.behavioral.state.InModerationState.ADMIN_ROLE;

/**
 *
 * @author Claudio
 */
public class Demo {

    private static String NORMARL_USER;

    public static void main(String[] args) {

        var document = new Document();
        User adminUser = new User(ADMIN_ROLE, "csuarez");
        User normalUser = new User(NORMARL_USER, "pperez");

        document.printStatus();

        document.publish(normalUser);
        document.printStatus();

        document.publish(adminUser);
        document.printStatus();

        document.publish(adminUser);

    }
}
