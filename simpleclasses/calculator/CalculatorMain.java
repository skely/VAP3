package simpleclasses.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 3);
        System.out.println(calculator.addVariables());

        int x = Calculator.add(5, 3);
        double y = Calculator.add(5.3, 3.2);

        System.out.println(x);
        System.out.println(y);
    }
}
