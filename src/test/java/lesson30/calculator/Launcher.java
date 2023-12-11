package lesson30.calculator;

public class Launcher {
    public static void main(String[] args) {
//        IOperation additional = new IOperation() {
//            @Override
//            public double operationI(double one, double two) {
//                return one + two;
//            }
//        };
        IOperation additional = (value1, value2) -> value1 + value2;
        Calculator calculator = new Calculator(additional);
        double additionalResult = calculator.performOperation(2, 2);
        System.out.println("Результат сложения " + additionalResult);

        IOperation subtraction = (one, two) -> one - two;
        calculator.setIOperation(subtraction);
        double subtractionResult = calculator.performOperation(10,5);
        System.out.println("Результат вычитания " + subtractionResult);
    }
}
