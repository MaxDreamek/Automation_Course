package lessons.lesson3.conditional;

public class SimpleExample {
    public static void main(String[] args) {
       simple();
    }
    public static void difficultExample()  {
        int num1 = 6;
        int num2 = 6;

        if (num1 != num2) {
            System.out.println("Числа не равны");
        } else if (num1 > num2) {
            System.out.println("First number bigger than second");
        } else if (num1 < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа не равны");
        }
    }
    public static void simple() {
        int num1 = 6;
        int num2 = 6;
        if(num1 != num2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }
}
