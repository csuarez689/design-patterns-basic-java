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
public class DepartmentExpression extends TerminalExpression {

    protected String department;

    public DepartmentExpression(String department) {
        super();
        this.department = department;
    }

    @Override
    public boolean interpret(Employee context) {
        return context.getDepartment().name().equalsIgnoreCase(department);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DepartmentExpression [department=").append(department).append("]");
        return builder.toString();
    }
}
