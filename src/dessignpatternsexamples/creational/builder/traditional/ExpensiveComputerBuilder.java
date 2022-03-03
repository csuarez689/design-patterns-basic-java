/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.builder.traditional;

/**
 *
 * @author Claudio
 */
public class ExpensiveComputerBuilder extends ComputerBuilder {

    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("Vinga Odin A7071");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("X-View 24\" Curve FullHD");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("mouse+keyboard+speakers+headphones");
    }
}
