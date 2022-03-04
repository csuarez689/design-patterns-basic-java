/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Claudio
 */
public class ProxyInternet implements IInternet {

    private IInternet internet = new DefaultInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("facebook.com");
        bannedSites.add("instagram.com");
    }

    @Override
    public void connectToHost(String url) {
        if (bannedSites.contains(url.toLowerCase())) {
            throw new RuntimeException("Access denied to " + url);
        }
        internet.connectToHost(url);
    }

}
