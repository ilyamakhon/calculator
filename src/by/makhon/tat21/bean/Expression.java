package by.makhon.tat21.bean;

public class Expression {



    private Double firstValue;
    private Double secondValue;
    private String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
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
