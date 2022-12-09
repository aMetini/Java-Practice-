package com.example.calculator.main;

import com.example.calculator.classes.*;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        System.out.println(simpleCalculator.addition(3.3, 4.5));

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println(scientificCalculator.square(10.0));
    }

}
