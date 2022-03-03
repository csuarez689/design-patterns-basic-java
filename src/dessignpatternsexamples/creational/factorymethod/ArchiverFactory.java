/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author Claudio
 */
public class ArchiverFactory {

    private static Map<String, Supplier<Archiver>> typeConstructorMap = new HashMap<>();

    static {
        typeConstructorMap.put("zip", ZipArchiver::new);
        typeConstructorMap.put("rar", RarArchiver::new);
    }

    public static Archiver getArchiver(String archiverType) {
        return typeConstructorMap.get(archiverType) == null ? null : typeConstructorMap.get(archiverType).get();
    }

}
