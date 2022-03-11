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
public class OrExpression implements IExpression {

    protected IExpression left;
    protected IExpression right;

    public OrExpression(IExpression left, IExpression right) {
        super();
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Employee context) {
        return left.interpret(context) || right.interpret(context);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("OrExpression [left=").append(left).append(", right=").append(right).append("]");
        return builder.toString();
    }
}
