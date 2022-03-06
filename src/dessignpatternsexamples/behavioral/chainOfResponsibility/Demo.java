/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.chainOfResponsibility;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class Demo {

    private final IDispenseChain dispenseChain;

    public Demo() {
        //init chains
        dispenseChain = new Dolar50Dispenser();
        IDispenseChain dispenseChain2 = new Dolar20Dispenser();
        IDispenseChain dispenseChain3 = new Dolar10Dispenser();
        //set the chain of responsibility
        dispenseChain.setNextLink(dispenseChain2);
        dispenseChain2.setNextLink(dispenseChain3);
    }

    public static void main(String[] args) {
        Demo dispenseDemo = new Demo();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense:");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount to dispense should be in multiple of 10");
                return;
            }

            dispenseDemo.dispenseChain.dispense(new Currency(amount));
        }
    }
}
