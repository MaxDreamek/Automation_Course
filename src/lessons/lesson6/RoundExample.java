package lessons.lesson6;

public class RoundExample {
    public static void main(String[] args) {
        double num = 22.2;

        System.out.println(Math.round(num)); // округление
        System.out.println(Math.ceil(num)); //  округление в большую сторону
        System.out.println(Math.floor(num)); // округление в меньшую сторону

        int a = (int) Math.floor(num);
        System.out.println(a);
    }
}
