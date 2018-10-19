package by.makhon.tat21;

import by.makhon.tat21.calculator.Calculator;
import by.makhon.tat21.validator.ReceivedValuesValidator;

public class Main {
    public static void main(String[] args) {

        ReceivedValuesValidator receivedValuesValidator = new ReceivedValuesValidator();
        Calculator calculator = new Calculator();

        String[] values = {"5.1321", "*", "2"};
        if (receivedValuesValidator.checkExpressionFormat(values)) {
            calculator.calculate(values);
        }
    }
}
