//package by.academy.homework7.task3.methodTestCalc;
//
//import by.academy.homework7.task3.java.Calculator;
//import by.academy.homework7.task3.java.TestRunnerListener;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(TestRunnerListener.class)
//class CalculatorTestDiv {
//
//    @Test
//    void div() {
//        assertEquals(2, 4, 2);
//    }
//
//    @ParameterizedTest
//    @CsvSource({"5,10,2",
//            "-5,10,-2",
//            "20,40,2"})
//    public void div(double exp, double v1, double v2) {
//        Calculator c = new Calculator(v1, v2);
//        System.out.println("Test method divide");
//        assertEquals(exp, c.div());
//    }
//}