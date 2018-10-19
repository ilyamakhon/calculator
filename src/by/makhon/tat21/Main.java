package by.makhon.tat21;

import by.makhon.tat21.bean.Expression;
import by.makhon.tat21.calculator.Calculator;
import by.makhon.tat21.converter.ExpressionConverter;

public class Main {
    public static void main(String[] args) {

        ExpressionConverter expressionConverter = new ExpressionConverter();
        Calculator calculator = new Calculator();

        Expression convertedExpression = expressionConverter.convertExpression(args);
        calculator.calculate(convertedExpression);
    }
}
