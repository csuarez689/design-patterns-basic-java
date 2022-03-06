/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.templateMethod;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        CrossCompiler iphone = new IPhoneCompiler();
        iphone.compile();
        System.out.println("#################################");
        CrossCompiler android = new AndroidCompiler();
        android.compile();
    }
}
