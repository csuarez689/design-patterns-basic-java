/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.templateMethod;

/**
 *
 * @author Claudio
 */
public class IPhoneCompiler extends CrossCompiler {

    @Override
    protected void collectSources() {
        System.out.println("Collected IPhone Sources");
    }

    @Override
    protected void compileToTarget() {
        System.out.println("IPhone compilation");
    }

}
