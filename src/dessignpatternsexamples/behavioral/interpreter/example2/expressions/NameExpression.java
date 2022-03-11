/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.interpreter.example2.expressions;

import dessignpatternsexamples.behavioral.interpreter.example2.Employee;

/**
 *
 * @author Claudio
 */
public class NameExpression extends TerminalExpression {

    protected String name;

    public NameExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Employee context) {
        return context.getEmployeeName().equalsIgnoreCase(name);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NameExpression [name=").append(name).append("]");
        return builder.toString();
    }
}
