/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.builder.traditional;

/**
 *
 * @author Claudio
 */
public class Computer {

    private String display;
    private String systemBlock;
    private String manipulators;

    /**
     * @param display the display to set
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * @param systemBlock the systemBlock to set
     */
    public void setSystemBlock(String systemBlock) {
        this.systemBlock = systemBlock;
    }

    /**
     * @param manipulators the manipulators to set
     */
    public void setManipulators(String manipulators) {
        this.manipulators = manipulators;
    }

    @Override
    public String toString() {
        return "Computer [display=" + display + ", systemBlock=" + systemBlock + ", manipulators=" + manipulators + "]";
    }

}
