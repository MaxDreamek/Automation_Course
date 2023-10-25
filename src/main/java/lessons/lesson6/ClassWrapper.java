package lessons.lesson6;

public class ClassWrapper {
    public static void main(String[] args) {
        int num = parseStringToInt();
        int sum = num + 10;
        System.out.println(sum);
//        Character;
//        Float;
//        Boolean

    }

    public static int parseStringToInt() {
        String num = "78323";
        int numInteger = Integer.parseInt(num);
        return numInteger;
    }
}
