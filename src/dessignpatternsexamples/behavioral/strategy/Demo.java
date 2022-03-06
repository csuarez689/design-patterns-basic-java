/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {

        CompressionContext ctx = new CompressionContext();
        ctx.setCompressionStrategy(new ZipCompressionStrategy());

        List<File> fileList = new ArrayList<>();
        ctx.createArchive(fileList);

        //functional implementation
        ctx.createArchive(fileList, file -> System.out.println("Any compression strategy here"));
        ctx.createArchive(fileList, Demo::customCompressStrategy);

        fileList.sort((file1, file2) -> file1.getName().compareTo(file2.getName()));

    }

    public static void customCompressStrategy(List<File> files) {
        System.out.println("Custom compression strategy");
    }
}
