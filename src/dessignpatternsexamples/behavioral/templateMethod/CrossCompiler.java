/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.templateMethod;

/**
 *
 * @author Claudio
 */
public abstract class CrossCompiler {

    public final void compile() {
        collectSources();
        reserveRam();
        compileToTarget();
        afterCompileHook();
        compilationStatusNotification();
    }

    private void compilationStatusNotification() {
        System.out.println("Compilation has been successful");
    }

    private void reserveRam() {
        System.out.println("RAM is reserved for compilation process");
    }

    protected void afterCompileHook() {
        //no action by default
    }

    protected abstract void collectSources();

    protected abstract void compileToTarget();

}
