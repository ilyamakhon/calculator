package by.makhon.tat21.calculator;

import by.makhon.tat21.bean.Expression;
import by.makhon.tat21.consolewriter.ResultConsoleWriter;

public class Calculator {

    public void calculate(Expression expression) {
        ResultConsoleWriter resultConsoleWriter = new ResultConsoleWriter();
        Double result;

        String operation = expression.getOperation();

        switch (operation) {
            case "+":
                result = expression.getFirstValue() + expression.getSecondValue();
                resultConsoleWriter.printResult(result, expression);
                break;
            case "-":
                result = expression.getFirstValue() - expression.getSecondValue();
                resultConsoleWriter.printResult(result, expression);
                break;
            case "x":
                result = expression.getFirstValue() * expression.getSecondValue();
                resultConsoleWriter.printResult(result, expression);
                break;
            case ":":
                result = expression.getFirstValue() / expression.getSecondValue();
                resultConsoleWriter.printResult(result, expression);
                break;
            default:
                System.out.println("Incorrect operation");
        }
    }
}
