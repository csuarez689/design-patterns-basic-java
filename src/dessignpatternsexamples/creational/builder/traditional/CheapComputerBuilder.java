/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.builder.traditional;

/**
 *
 * @author Claudio
 */
public class CheapComputerBuilder extends ComputerBuilder {

    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("Everest Home Block");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("X-View 19\" HD");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("mouse+keyboard");
    }

}
