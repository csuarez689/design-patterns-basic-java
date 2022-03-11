/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.interpreter.example2;

import dessignpatternsexamples.behavioral.interpreter.example2.expressions.IExpression;
import dessignpatternsexamples.behavioral.interpreter.example2.expressions.ExpressionParser;

/**
 *
 * @author Claudio
 */
public class Demo {

    public static void main(String[] args) {
        Engineer juan = new Engineer(10011, "Juan", "Developer", Department.ENG, 75000);
        Engineer carlos = new Engineer(10021, "Carlos", "Developer", Department.ENG, 65000);
        Manager marcos = new Manager(10041, "Marcos", "Sr. Manager", Department.ENG, 90000);
        Manager pedro = new Manager(10041, "Pedro", "Manager", Department.ENG, 100000);
        Engineer matias = new Engineer(10031, "Matias", "QA", Department.ENG, 75000);

        pedro.manages(juan);
        pedro.manages(marcos);
        pedro.manages(carlos);

        marcos.manages(matias);
        marcos.manages(pedro);

        String contextString = "Desig:manager, Dept:eng, Manages:pedro, salary:900000";
        IExpression expression = ExpressionParser.parseExpression(contextString);
        System.out.println("contextString = " + contextString);
        System.out.println();
        System.out.println(pedro);
        System.out.printf("For '%s', %s: %s.\n", pedro.getEmployeeName(), expression, expression.interpret(pedro));

        System.out.println("=======================================================================\n");
        contextString = "Desig:developer, Deptt:eng, salary:<85000";
        expression = ExpressionParser.parseExpression(contextString);
        System.out.println("contextString = " + contextString);
        System.out.println();
        System.out.println(juan);
        System.out.printf("For '%s', %s: %s.\n", juan.getEmployeeName(), expression, expression.interpret(juan));
        System.out.println();
        System.out.println(carlos);
        System.out.printf("For '%s', %s: %s.\n", carlos.getEmployeeName(), expression,
                expression.interpret(carlos));
    }
}
