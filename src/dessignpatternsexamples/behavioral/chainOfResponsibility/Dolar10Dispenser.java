/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.chainOfResponsibility;

/**
 *
 * @author Claudio
 */
public class Dolar10Dispenser implements IDispenseChain {

    private IDispenseChain dispenseChain;

    @Override
    public void setNextLink(IDispenseChain nextChain) {
        dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int rem = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " $10");
            if (rem != 0) {
                this.dispenseChain.dispense(new Currency(rem));
            }
        } else {
            dispenseChain.dispense(currency);
        }
    }
}
