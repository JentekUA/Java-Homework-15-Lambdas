package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation operation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.printf("Math operation: %s%n", operation.operate(40, 2));

        StringManipulator manipulator = string -> string.toUpperCase();
        System.out.printf("String manipulator: %s%n", manipulator.manipulate("hello world"));

        Function<String, Integer> countFunction = StringListProcessor::countUpperCase;
        System.out.printf("Count function: %s%n", countFunction.apply("hellO World"));

        Supplier<Integer> supplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.printf("Random int supplier: %s%n", supplier.get());
    }
}