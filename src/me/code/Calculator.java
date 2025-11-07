package me.code;

public class Calculator {
    private int number;

    private Calculator(int numbers) {
        this.number = numbers;
    }

    private int add(int other) {
        return this.number + other;
    }
}
