/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dessignpatternsexamples.behavioral.interpreter.example1;

/**
 *
 * @author Claudio
 */
public class Demo {

    public InterpreterContext ic;

    public Demo(InterpreterContext ic) {
        this.ic = ic;
    }

    public String interpret(String str) {
        IExpression exp;
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else {
            return str;
        }
        return exp.interpret(ic);
    }

    public static void main(String[] args) {
        Demo client = new Demo(new InterpreterContext());
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        System.out.println(str1 + " = " + client.interpret(str1));
        System.out.println(str2 + " = " + client.interpret(str2));

    }
}
