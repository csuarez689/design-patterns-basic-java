/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.strategy;

import java.io.File;
import java.util.List;

/**
 *
 * @author Claudio
 */
public class ZipCompressionStrategy implements ICompressionStrategy {

    @Override
    public void compressFiles(List<File> files) {
        //using ZIP approach
        System.out.println("Zip compression");
    }
}
