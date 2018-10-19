package by.makhon.tat21.calculator;

import by.makhon.tat21.consolewriter.ResultConsoleWriter;
import by.makhon.tat21.converter.ValuesConverter;

public class Calculator {

    public void calculate(String[] values) {

        ValuesConverter valuesConverter = new ValuesConverter();
        ResultConsoleWriter resultConsoleWriter = new ResultConsoleWriter();

        Double firstValue = valuesConverter.convertToNumber(values[0]);
        Double secondValue = valuesConverter.convertToNumber(values[2]);
        Double result;

        switch (values[1]) {
            case "+":
                result = firstValue + secondValue;
                resultConsoleWriter.printResult(firstValue, values[1], secondValue, result);
                break;
            case "-":
                result = firstValue - secondValue;
                resultConsoleWriter.printResult(firstValue, values[1], secondValue, result);
                break;
            case "*":
                result = firstValue * secondValue;
                resultConsoleWriter.printResult(firstValue, values[1], secondValue, result);
                break;
            case "/":
                result = firstValue / secondValue;
                resultConsoleWriter.printResult(firstValue, values[1], secondValue, result);
                break;
        }
    }
}
