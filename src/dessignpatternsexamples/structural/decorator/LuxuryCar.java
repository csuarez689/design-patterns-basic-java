/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.decorator;

/**
 *
 * @author Claudio
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(ICar car) {
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(" And driver soft as luxury car");
    }
}
