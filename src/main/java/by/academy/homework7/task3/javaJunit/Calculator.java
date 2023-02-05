package by.academy.homework7.task3.javaJunit;

public class Calculator {
    private double a;
    private double b;
    private char sign;

    public Calculator(double a, double b, char sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void resultPrint() {
        System.out.println(a + " " + sign + " " + b + " " + " = " + getResult());
    }

    public double getResult() {
        if (sign == '+') {
            return sum();
        } else if (sign == '-') {
            return diff();
        } else if (sign == '*') {
            return multi();
        } else if (sign == '/') {
            return div();
        }
        return 0;
    }

    public double sum() {
        return a + b;
    }

    public double diff() {
        return a - b;
    }

    public double multi() {
        return a * b;
    }

    public double div() {
        return a / b;
    }

}
