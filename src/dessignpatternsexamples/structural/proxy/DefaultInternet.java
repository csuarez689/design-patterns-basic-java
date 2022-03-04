/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.proxy;

/**
 *
 * @author Claudio
 */
public class DefaultInternet implements IInternet {

    @Override
    public void connectToHost(String url) {
        System.out.println("Connecting to " + url);
    }

}
