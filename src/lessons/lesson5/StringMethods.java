package lessons.lesson5;

public class StringMethods {
    public static void main(String[] args) {
        lengthMethod();
        concatMethod();
        trimMethod();
        endsWithMethod();
        caseMethods();
        equalsMethods();
        containsMethods();
        charAthMethods();
        toCharArrayMethods();
        indexOfMethods();
        substringMethods();
        replaceMethods();
    }

    public static void replaceMethods() {
        String str = "My name is Alex";
        String replaceStr = str.replace("Alex", "Max");
        System.out.println(replaceStr);
    }
    public static void substringMethods() {
        String str = "My name is Alex";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 7));
    }
    public static void indexOfMethods() {
        String str = "My name is Alex";

        System.out.println(str.indexOf('M'));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("sada"));
    }
    public static void toCharArrayMethods() {
        String str = "My name is Alex";
        char[] result = str.toCharArray();

        for (Character r: result) {
            System.out.print(r + " ");
        }
        System.out.println();
    }
    public static void charAthMethods() {
        String str = "My name is Alex";
        char result = str.charAt(4);
        System.out.println(result);
    }
    public static void containsMethods() {
        String str = "My name is Alex";
        String str2 = "My name is Alex";
        boolean resultOfContains = str.contains(str2);
        System.out.println(resultOfContains);
    }

    public static void equalsMethods() {
        String str = "My name is Alex";
        String str2 = "My name is Alex";
        System.out.println(str.equals(str2));
    }
    public static void caseMethods() {
        String str = "My name is Alex";
        String toUpper = str.toUpperCase();
        String toLower = str.toLowerCase();

        System.out.println(toUpper);
        System.out.println(toLower);
    }
    public static void lengthMethod() {
        String name = "Alex Alex";
        System.out.println(name.length());
    }
    public static void concatMethod() {
        String text1 = "Hello ";
        String text2 = "world";
        String result = text1.concat(text2);
        System.out.println(result);
        endsWithMethod();
    }
    public static void trimMethod() {
        String str = "        My name is Alex   ";
        System.out.println(str.trim());
        System.out.println(str);
    }
    public static void endsWithMethod() {
        String str = "My name is Alex";
        boolean ends1 = str.endsWith("Alex");
        boolean ends2 = str.endsWith("Max");

        System.out.println(ends1);
        System.out.println(ends2);

    }
}
