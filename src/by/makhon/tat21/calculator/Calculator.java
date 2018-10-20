package by.makhon.tat21.calculator;

import by.makhon.tat21.bean.Expression;

public class Calculator {

    public Double calculate(Expression expression) {
        Double firstValue = expression.getFirstValue();
        Double secondValue = expression.getSecondValue();

        Expression.Operation operation = expression.getOperation();

        switch (operation) {
            case PLUS:
                return firstValue + secondValue;
            case MINUS:
                return firstValue - secondValue;
            case MULTIPLE:
                return firstValue * secondValue;
            case DIVIDE:
                return firstValue / secondValue;
            default:
                return 0.0;
        }
    }
}
