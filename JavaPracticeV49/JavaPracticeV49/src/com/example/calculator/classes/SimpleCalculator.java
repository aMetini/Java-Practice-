package com.example.calculator.classes;

import com.example.calculator.interfaces.BasicMathOperations;

public class SimpleCalculator implements BasicMathOperations {

    @Override
    public double addition(double firstNumber, double secondNumber) {
        // TODO Auto-generated method stub
        return firstNumber + secondNumber;
    }

    @Override
    public double subtraction(double firstNumber, double secondNumber) {
        // TODO Auto-generated method stub
        return firstNumber - secondNumber;
    }

    @Override
    public double multiplication(double firstNumber, double secondNumber) {
        // TODO Auto-generated method stub
        return firstNumber * secondNumber;
    }

    @Override
    public double division(double firstNumber, double secondNumber) {
        // TODO Auto-generated method stub
        double result = firstNumber / secondNumber;
        if (Double.isInfinite(result)) {
            System.out.println("Division by zero?");
            return -0.123456789;
        } else {
            return result;
        }
        
    }

}
