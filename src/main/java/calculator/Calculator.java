package calculator;

public class Calculator {

    public String calculate(String[] expression) {


        double a = Double.parseDouble(expression[0]);
        String op = expression[1];
        double b = Double.parseDouble(expression[2]);
        double result;

        switch (op) {

            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                result = 0;
        }

        return "" + result;
    }

}
