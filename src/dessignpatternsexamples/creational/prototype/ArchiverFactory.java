/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Claudio
 */
public class ArchiverFactory {

    private static Map<String, Archiver> prototypes = new HashMap<>();

    static {
        prototypes.put("zip", new ZipArchiver());
        prototypes.put("rar", new RarArchiver());
    }

    public static Archiver getPrototypeForType(String archiverType) {
        return prototypes.get(archiverType).clone();
    }

}
