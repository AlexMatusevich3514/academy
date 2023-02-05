//package by.academy.homework7.task3.methodTestCalc;
//
//import by.academy.homework7.task3.java.Calculator;
//import by.academy.homework7.task3.java.TestRunnerListener;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.junit.runners.Suite;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(TestRunnerListener.class)
//public class CalculatorTestSum {
//
//    @ParameterizedTest
//    @CsvSource({"5,3,2",
//            "-5,10,-15",
//            "20,10,10"})
//    public void sum(double exp, double v1, double v2) {
//        Calculator c = new Calculator(v1, v2);
//        System.out.println("Test method sum");
//        assertEquals(exp, c.sum());
//    }
//}