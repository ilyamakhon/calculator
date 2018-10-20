package by.makhon.tat21.bean;

import java.util.List;

import static java.util.Arrays.asList;

public class Expression {

    private Operation operation;

    private Double firstValue;
    private Double secondValue;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public enum Operation {
        PLUS("+"), MINUS("-"), MULTIPLE("x", "X"), DIVIDE(":");

        private List<String> symbols;

        Operation(String... symbols) {
            this.symbols = asList(symbols);
        }

        public static Operation parseFromString(String symbol) {
            for (Operation operation : Operation.values()) {
                if (operation.symbols.contains(symbol)) {
                    return operation;
                }
            }
            return null;
        }

    }

    public Double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Double firstValue) {
        this.firstValue = firstValue;
    }

    public Double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Double secondValue) {
        this.secondValue = secondValue;
    }
}
