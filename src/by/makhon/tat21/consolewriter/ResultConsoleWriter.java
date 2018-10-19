package by.makhon.tat21.consolewriter;

import by.makhon.tat21.bean.Expression;

public class ResultConsoleWriter {

    public void printResult(Double result, Expression expression) {
        System.out.println(expression.getFirstValue() + " " + expression.getOperation() + " " +
                            expression.getSecondValue() + " = " + result);
    }
}
