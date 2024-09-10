package simpleclasses.calculator;

public class Calculator {
    private double variableA;
    private double variableB;

    public Calculator() {
    }

    public Calculator(double variableA, double variableB) {
        this.variableA = variableA;
        this.variableB = variableB;
    }

    public double addVariables() {
        return variableA + variableB;
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
}
