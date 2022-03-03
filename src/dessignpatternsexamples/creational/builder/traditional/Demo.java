/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.creational.builder.traditional;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new CheapComputerBuilder());
        director.buildComputer();
        Computer computer = director.getComputer();
        System.out.println(computer);

        director.setComputerBuilder(new ExpensiveComputerBuilder());
        director.buildComputer();
        computer = director.getComputer();
        System.out.println(computer);
    }
}
