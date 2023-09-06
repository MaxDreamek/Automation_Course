package homeworks.hm7;

import java.util.Arrays;

public class Posidelki {
    public static void main(String[] args) {
// Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
        System.out.println(toJadenCase2("toJadenCase doesn't return a valide JadenCase String! try again please :)\", \"Most Trees Are Blue"));

    }


    public static void toJadenCase(String phrase) {
        String[] b = phrase.split(" ");
        phrase = "";

        System.out.println(Arrays.toString(b));
        for (int i = 0; i < b.length; i++) {

            char replace = Character.toUpperCase(b[i].charAt(0));
            b[i] = b[i].replace(b[i].charAt(0), replace);
            phrase = phrase.concat(b[i] + " ");
        }
        System.out.println(phrase);
    }

    public static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        } else {
            String[] b = phrase.split(" ");
            phrase = "";

            for (int i = 0; i < b.length; i++) {
                char[] arr = b[i].toCharArray();
                arr[0] = Character.toUpperCase(arr[0]);
                b[i] = String.copyValueOf(arr);
                if (i == b.length - 1) {
                    phrase = phrase.concat(b[i]);
                } else {
                    phrase = phrase.concat(b[i] + " ");
                }
            }
            return phrase;
        }
    }
}


