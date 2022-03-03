/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.prototype;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;

/**
 *
 * @author Claudio
 */
public class ZipArchiver implements Archiver, Serializable {

    @Override
    public void archive(File directry) {
        System.out.println("ZIP Archiver");
    }

    @Override
    public Archiver clone() {
        return (Archiver) SerializationUtils.clone(this);
    }

}
