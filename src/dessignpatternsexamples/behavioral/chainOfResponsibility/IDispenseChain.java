/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dessignpatternsexamples.behavioral.chainOfResponsibility;

/**
 *
 * @author Claudio
 */
public interface IDispenseChain {

    void setNextLink(IDispenseChain nextChain);

    void dispense(Currency currency);
}
