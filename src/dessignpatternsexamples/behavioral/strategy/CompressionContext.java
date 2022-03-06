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
public class CompressionContext {

    private ICompressionStrategy strategy;

    public void setCompressionStrategy(ICompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void createArchive(List<File> files) {
        strategy.compressFiles(files);
    }

    public void createArchive(List<File> files, ICompressionStrategy cs) {
        cs.compressFiles(files);
    }
}
