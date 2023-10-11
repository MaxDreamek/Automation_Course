package lessons.lesson14.exception;

public class UncheckedExample {
    public static void main(String[] args) {
        divisionOnNull();
    }
    public static void divisionOnNull() {
        try {
            int a = 4;
            System.out.println(a / 0);
        } catch (ArithmeticException e){
            System.err.println("На ноль делить нельзя");
        }
        System.out.println("Программа продолжает работу");
    }
}
