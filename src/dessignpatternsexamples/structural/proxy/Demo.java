/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.proxy;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        IInternet internet = new ProxyInternet();
        internet.connectToHost("google.com.ar");
        internet.connectToHost("facebook.com");
    }

}
