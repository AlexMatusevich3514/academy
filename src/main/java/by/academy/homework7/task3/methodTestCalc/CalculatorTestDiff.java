//package by.academy.homework7.task3.methodTestCalc;
//
//import by.academy.homework7.task3.java.Calculator;
//import by.academy.homework7.task3.java.TestRunnerListener;
//import by.academy.junit.listener.TestRunner;
//import org.junit.Before;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.runner.RunWith;
//
//import java.lang.reflect.Method;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(TestRunnerListener.class)
//public class CalculatorTestDiff {
//
//    @ParameterizedTest
//    @CsvSource({"5,10,5",
//            "25,10,-15",
//            "0,10,10"})
//    public void diff(double exp, double v1, double v2) {
//        Calculator c = new Calculator(v1, v2);
//        System.out.println("Test method diff");
//        assertEquals(exp, c.diff());
//    }
//
//}