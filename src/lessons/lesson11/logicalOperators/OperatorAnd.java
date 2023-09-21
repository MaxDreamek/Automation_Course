package lessons.lesson11.logicalOperators;

public class OperatorAnd {
    public static void main(String[] args) {
        exampleWithTwoAmpersant();
        exampleWithOneAmpersant();
    }
    public static void exampleWithTwoAmpersant() {
        int a = 10;
        if(++a == 10 && ++a == 12) {
            ++a;
        }
        System.out.println(a);
    }
    public static void exampleWithOneAmpersant() {
        int mouse = 5;
        int weight = 45;

        if (mouse != 0 & weight < 100) {
            System.out.println("Можно кормить кота!");
        }
    }
}
