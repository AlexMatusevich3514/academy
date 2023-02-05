//package by.academy.homework7.task3.java;
//
//import org.junit.runner.notification.RunNotifier;
//import org.junit.runners.BlockJUnit4ClassRunner;
//import org.junit.runners.model.InitializationError;
//
//public class TestRunnerListener extends BlockJUnit4ClassRunner {
//    private CalculatorTestListener calculatorTestListener;
//
//    public TestRunnerListener(Class<CalculatorTestListener> testClass) throws InitializationError {
//        super(testClass);
//        calculatorTestListener = new CalculatorTestListener();
//    }
//
//    @Override
//    public void run(final RunNotifier notifier) {
//        notifier.addListener(calculatorTestListener);
//        super.run(notifier);
//    }
//}
