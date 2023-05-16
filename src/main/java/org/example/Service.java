package org.example;

public class Service {

    private Calculator calculator;

    public Service(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate(String operation, int a, int b) {
        if (operation.equals("add") ) {
            return calculator.add(a, b);
        } else if (operation.equals("subtract")) {
            return calculator.substract(a, b);
        } else {
            return 0;
        }
    }
}
