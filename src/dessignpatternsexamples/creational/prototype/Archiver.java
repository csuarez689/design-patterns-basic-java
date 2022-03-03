/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dessignpatternsexamples.creational.prototype;

import java.io.File;

/**
 *
 * @author Claudio
 */
public interface Archiver {

    void archive(File directry);

    Archiver clone();
}
