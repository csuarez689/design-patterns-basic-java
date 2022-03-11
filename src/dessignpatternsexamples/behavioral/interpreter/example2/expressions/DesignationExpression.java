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
public class DesignationExpression extends TerminalExpression {

    protected String designation;

    public DesignationExpression(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean interpret(Employee context) {
        return context.getDesignation().equalsIgnoreCase(designation);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DesignationExpression [designation=").append(designation).append("]");
        return builder.toString();
    }
}
