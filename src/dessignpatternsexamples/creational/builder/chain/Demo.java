/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.builder.chain;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        Account account = Account.newBuilder()
                .setToken("0123456789")
                .setUserId(1).build();

        System.out.println(account);
    }
}
