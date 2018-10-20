package by.makhon.tat21.converter;

import by.makhon.tat21.bean.Expression;

public class ExpressionConverter {

    public Expression convertExpression(String[] values) {

        Expression convertedExpression = new Expression();

        if (values == null || values.length != 3) {
            throw new IllegalArgumentException("Incorrect expression! (Check separations between numbers and operation. CORRECT FORMAT EXAMPLE : '5 + 5')");
        }

        Double firstValue = parseToDouble(values[0]);
        Expression.Operation operation = parseOperation(values[1]);
        Double secondValue = parseToDouble(values[2]);


        convertedExpression.setFirstValue(firstValue);
        convertedExpression.setOperation(operation);
        convertedExpression.setSecondValue(secondValue);

        return convertedExpression;
    }

    private Double parseToDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
            throw new IllegalArgumentException("Wrong value");
        }
    }

    private Expression.Operation parseOperation(String value) {
        Expression.Operation operation = Expression.Operation.parseFromString(value);
        if (operation == null) {
            throw new IllegalArgumentException("Wrong operation");
        }
        return operation;
    }

}
