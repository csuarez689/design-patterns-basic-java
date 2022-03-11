/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.interpreter.example2.expressions;

/**
 *
 * @author Claudio
 */
public class ExpressionParser {

    protected static final String NAME = "name";
    protected static final String DESIG = "desig";
    protected static final String DEPTT = "dept";
    protected static final String MANAGES = "manages";
    protected static final String SALARY = "salary";

    public static IExpression parseExpression(String contextString) {
        IExpression expression = null;
        String[] keyValues = contextString.split(",");
        for (int index = 0; index < keyValues.length; index++) {
            String keyValue = keyValues[index];
            String[] words = keyValue.trim().split(":");
            IExpression anotherExpression = getExpression(words[0].trim(), words[1].trim());
            if (expression == null) {
                expression = anotherExpression;
            } else {
                expression = new AndExpression(expression, anotherExpression);
            }
        }
        return expression;
    }

    public static IExpression getExpression(String keyword, String value) {
        if (NAME.equalsIgnoreCase(keyword)) {
            return new NameExpression(value);
        } else if (DESIG.equalsIgnoreCase(keyword)) {
            return new DesignationExpression(value);
        } else if (DEPTT.equalsIgnoreCase(keyword)) {
            return new DepartmentExpression(value);
        } else if (MANAGES.equalsIgnoreCase(keyword)) {
            return new ManagerOfExpression(value);
        } else if (SALARY.equalsIgnoreCase(keyword)) {
            return new SalaryExpression(value);
        }
        return null;
    }
}
