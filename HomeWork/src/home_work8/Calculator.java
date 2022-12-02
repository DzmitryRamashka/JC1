package home_work8;

public class Calculator {
    private double result = 0;

    public Calculator() {

    }

    public double getResult() {
        return result;
    }

    public double cancelResult() {
        return result = 0;
    }

    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    public double addByNumber(double a) {
        return result += a;
    }

    public double subtract(double a,double b) {
        result = a - b;
        return result;
    }

    public double subtractByNumber(double a) {
        return result -= a;
    }

    public double multiply(double a,double b) {
        result = a*b;
        return result;

    }

    public double multiplyByNumber(double a) {
        return result *= a;
    }


    public double divide(double a,double b) {
        if (b != 0) {
            result = a / b;
        } else {
            System.out.println("not possible to divide by 0");
            result = 0;
        }
        return result;
    }

    public double divideByNumber(double b) {
        if (b != 0) {
            result /= b;
        } else {
            System.out.println("not possible to divide by 0");
            result = 0;
        }
        return result;
    }

    }



