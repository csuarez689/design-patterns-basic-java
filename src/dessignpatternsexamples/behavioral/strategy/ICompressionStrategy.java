/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dessignpatternsexamples.behavioral.strategy;

import java.io.File;
import java.util.List;

/**
 *
 * @author Claudio
 */
@FunctionalInterface
public interface ICompressionStrategy {

    void compressFiles(List<File> files);

}
