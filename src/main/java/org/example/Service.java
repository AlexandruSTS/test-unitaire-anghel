package org.example;

public class Service {

    Calculator calculator = new Calculator();

    int calculate(String operation, int a, int b) {
        if (operation == "add") {
            return calculator.add(a, b);
        } else if (operation == "subtract") {
            return calculator.substract(a, b);
        } else {
            return 0;
        }
    }
}
