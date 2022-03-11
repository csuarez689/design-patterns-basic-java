/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.interpreter.example2.expressions;

import dessignpatternsexamples.behavioral.interpreter.example2.Employee;
import dessignpatternsexamples.behavioral.interpreter.example2.Manager;
import java.util.stream.Collectors;

/**
 *
 * @author Claudio
 */
public class ManagerOfExpression extends TerminalExpression {

    protected String name;

    public ManagerOfExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Employee context) {
        if (context.isManager()) {
            Manager manager = (Manager) context;
            return manager.getManagingEmployees().stream()
                    .map(managingEmployee -> managingEmployee.getEmployeeName().toLowerCase())
                    .collect(Collectors.toList()).contains(name.toLowerCase());
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ManagerOfExpression [name=").append(name).append("]");
        return builder.toString();
    }
}
