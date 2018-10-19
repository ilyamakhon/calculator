package by.makhon.tat21.converter;

import by.makhon.tat21.bean.Expression;
import by.makhon.tat21.calculator.Calculator;

public class ExpressionConverter {

    public Expression convertExpression(String[] values) {

        Expression convertedExpression = new Expression();

        if (values.length != 3) {
            System.out.println("Incorrect expression! (Check separations between numbers and operation. CORRECT FORMAT EXAMPLE : '5 + 5')");
        } else {
            convertedExpression.setFirstValue(Double.parseDouble(values[0]));
            convertedExpression.setOperation(values[1]);
            convertedExpression.setSecondValue(Double.parseDouble(values[2]));
        }
        return convertedExpression;
    }
}
