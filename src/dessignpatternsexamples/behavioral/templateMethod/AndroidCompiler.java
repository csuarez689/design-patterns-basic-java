/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.templateMethod;

/**
 *
 * @author Claudio
 */
public class AndroidCompiler extends CrossCompiler {

    @Override
    protected void collectSources() {
        System.out.println("Collected Adroid Sources");
    }

    @Override
    protected void compileToTarget() {
        System.out.println("Android compilation");
    }

    @Override
    protected void afterCompileHook() {
        System.out.println("Android after compile hook");
    }
}
