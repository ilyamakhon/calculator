package by.makhon.tat21.validator;


public class ReceivedValuesValidator {

    public boolean checkExpressionFormat(String[] values) {

        if (values == null) {
            System.out.println("No values");
            return false;
        }

        if (values.length > 3) {
            System.out.println("Incorrect format");
            return false;
        }

        for (int i = 0; i < values.length; i+=2) {
            if (!valuesIsNumeric(values[i])) {
                System.out.println("Value: " + values[i] + " - is not a number!");
            }
        }

        if (!operationIsCorrect(values[1])) {
            System.out.println("Operation: " + values[1] + " - is not correct!");
            return false;
        }
        return true;

    }

    public boolean operationIsCorrect(String value) {
        if (value.equals("+") || value.equals("-") ||
                value.equals("*") || value.equals("/")){
            return true;
        }
        return false;
    }

    public boolean valuesIsNumeric(String value) {
        if (value.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)")) {
            return true;
        }else {
            return false;
        }
    }

}
