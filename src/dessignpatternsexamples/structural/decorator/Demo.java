/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.structural.decorator;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        ICar basicCar = new BasicCar();
        basicCar.drive();
        System.out.println("\n***************\n");

        SportCar sportCar = new SportCar(new BasicCar());
        sportCar.setTransmissionMode("manual");
        sportCar.drive();
        System.out.println("\n***************\n");

        ICar sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.drive();
        System.out.println("\n***************\n");

    }
}
