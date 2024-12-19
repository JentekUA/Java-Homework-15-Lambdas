package app;

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
    }
}