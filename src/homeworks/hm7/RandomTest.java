package homeworks.hm7;

import java.util.Arrays;

public class RandomTest {
    public static void main(String[] args) {
        // [2, 20]
        // double randomNumber = Math.random() * (max + 1 - min) + min;

        double twoToTwenty = Math.random() * (20 - 2 + 1) + 2;

        // (2, 20]
        // Math.random() * (max - min) + min + 1;

        double biggerThanTwoToTwenty = Math.random() * (20 - 2) + 2 + 1;

        // [2, 20)
        // Math.random() * (max - min) + min;

        double twoToUpToTwenty = Math.random() * (20 - 2) + 2;
        double [] testArrays = new double[100];
        for (int i = 0; i < testArrays.length; i++) {
            testArrays[i] =   (Math.random() * (20 - 2) + 3);
            if (testArrays[i] == 2.00){
                System.out.println(true);
            }
        }
        System.out.println(Arrays.toString(testArrays));

    }

}
