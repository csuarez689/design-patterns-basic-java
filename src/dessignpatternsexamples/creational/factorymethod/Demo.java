/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.factorymethod;

import java.io.File;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        Archiver zipArchiver = ArchiverFactory.getArchiver("zip");
        Archiver rarArchiver = ArchiverFactory.getArchiver("rar");

        zipArchiver.archive(new File(""));
        rarArchiver.archive(new File(""));

        System.out.println(ArchiverFactory.getArchiver("zip") == zipArchiver);
    }
}
