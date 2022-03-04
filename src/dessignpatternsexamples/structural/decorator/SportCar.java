/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.decorator;

/**
 *
 * @author Claudio
 */
public class SportCar extends CarDecorator {

    private String transmissionMode;

    public SportCar(ICar car) {
        super(car);
    }

    public void setTransmissionMode(String transmissionMode) {
        this.transmissionMode = transmissionMode;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println(" And drives fast as Sport Car with " + transmissionMode);
    }
}
