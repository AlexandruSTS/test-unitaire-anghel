package org.example;

public class Main {
    public static void main(String[] args) {
        Service service = new Service(new Calculator());
        System.out.println(service.calculate("subtrac", 4 , 7));
    }
}