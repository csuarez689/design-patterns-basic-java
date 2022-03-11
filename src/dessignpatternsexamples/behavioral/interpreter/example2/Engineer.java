/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.interpreter.example2;

/**
 *
 * @author Claudio
 */
public class Engineer extends Employee {

    public Engineer(long employeeId, String employeeName, String designation, Department department, int salary) {
        super(employeeId, employeeName, designation, department, salary);
    }

    @Override
    public int teamSize() {
        return 1;
    }

    @Override
    public boolean isManager() {
        return false;
    }

    @Override
    public String teamNames() {
        return "{NA}";
    }
}
