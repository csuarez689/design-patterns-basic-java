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
public class ZipArchiver implements Archiver {

    @Override
    public void archive(File directry) {
        System.out.println("ZIP Archiver");
    }

}
