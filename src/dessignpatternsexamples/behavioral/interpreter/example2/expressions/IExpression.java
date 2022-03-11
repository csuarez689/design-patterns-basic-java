/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dessignpatternsexamples.behavioral.interpreter.example2.expressions;

import dessignpatternsexamples.behavioral.interpreter.example2.Employee;

/**
 *
 * @author Claudio
 */
public interface IExpression {

    public boolean interpret(Employee context);

}
