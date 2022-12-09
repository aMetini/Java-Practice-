package com.example.calculator.classes;
import com.example.calculator.interfaces.*;

public class ScientificCalculator extends SimpleCalculator implements AdvancedMathOperations {

    @Override
    public double square(double number) {
        // TODO Auto-generated method stub
        return Math.pow(number, 2);
    }

    @Override
    public double raisedToThePower(double base, double exponent) {
        // TODO Auto-generated method stub
        return Math.pow(base, exponent);
    }

    @Override
    public double remainder(double dividend, double divisor) {
        // TODO Auto-generated method stub
        return dividend % divisor;
    }
    
}
