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
        System.out.println(operation.operate(40, 2));

        StringManipulator manipulator = string -> string.toLowerCase();
        System.out.println(manipulator.manipulate("hello world"));

        Function<String, Integer> countFunction = StringListProcessor::countUpperCase;
        System.out.println(countFunction.apply("hello world"));

        Supplier<Integer> supplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println(supplier.get());
    }
}