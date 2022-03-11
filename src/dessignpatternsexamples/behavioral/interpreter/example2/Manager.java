/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.interpreter.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Claudio
 */
public class Manager extends Employee {

    List<Employee> managingEmployees = new ArrayList<>();

    public Manager(long employeeId, String employeeName, String designation, Department department, int salary) {
        super(employeeId, employeeName, designation, department, salary);
    }

    public boolean manages(Employee employee) {
        return managingEmployees.add(employee);
    }

    public boolean stopManaging(Employee employee) {
        return managingEmployees.remove(employee);
    }

    public List<Employee> getManagingEmployees() {
        return managingEmployees;
    }

    @Override
    public int teamSize() {
        return managingEmployees.stream().mapToInt(employee -> employee.teamSize()).sum();
    }

    @Override
    public boolean isManager() {
        return true;
    }

    @Override
    public String teamNames() {
        StringBuilder builder = new StringBuilder();
        builder.append("{").append(String.join(", ", managingEmployees.stream().map(employee -> {
            if (employee.isManager()) {
                return employee.getEmployeeName() + " " + employee.teamNames();
            } else {
                return employee.getEmployeeName();
            }
        }).collect(Collectors.toList()))).append("}");
        return builder.toString();
    }
}
