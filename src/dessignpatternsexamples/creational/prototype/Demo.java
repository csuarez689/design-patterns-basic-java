/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.prototype;

import java.io.File;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        String archiverType1 = "rar";
        String archiverType2 = "zip";

        Archiver zipArchiver = ArchiverFactory.getPrototypeForType(archiverType2);
        Archiver rarArchiver = ArchiverFactory.getPrototypeForType(archiverType1);

        zipArchiver.archive(new File(""));
        rarArchiver.archive(new File(""));

    }
}
