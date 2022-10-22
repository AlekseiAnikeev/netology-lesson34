package ru.agentche;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 22.10.2022
 */
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(5, 15));
        System.out.println(intsCalc.mult(5, 15));
        System.out.println(intsCalc.pow(5, 15));
    }
}
