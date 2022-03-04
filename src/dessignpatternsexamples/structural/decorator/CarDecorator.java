/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.decorator;

/**
 *
 * @author Claudio
 */
public class CarDecorator implements ICar {

    private ICar car;

    public CarDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public void drive() {
        this.car.drive();
    }

}
