public class Calculator {
    private double num1;
    private double num2;
    //private char operator;

    public double getFirstNumber(double firstNumber) {
        return firstNumber;
    }

    public double setFirstNumber(double firstNumber) {
        return this.num1 = firstNumber;
    }

    public double getSecondNumber(double secondNumber) {
        return secondNumber;
    }

    public double setSecondNumber(double secondNumber) {
        return this.num2 = secondNumber;
    }

    public double addition(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    }
    
    public double subtraction(double firstNumber, double secondNumber) {
        return (firstNumber - secondNumber);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        return (firstNumber * secondNumber);
    }

    public double division(double firstNumber, double secondNumber) {
        return (firstNumber / secondNumber);
    }
}
