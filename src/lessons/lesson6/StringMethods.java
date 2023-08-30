package lessons.lesson6;

public class StringMethods {
    public static void main(String[] args) {
        equalsIgnoreCaseMethods();
        lastIndexOfMethod();
        valueOfMethod();
    }

    public static void valueOfMethod() {
        int num = 2342342;
        String numStr = String.valueOf(num);
        System.out.println(numStr);
    }
    public static void lastIndexOfMethod() {
        String str = "Hello, my name is Alex";
        System.out.println(str.indexOf("l"));
        System.out.println(str.lastIndexOf("l"));
    }

    public static void equalsIgnoreCaseMethods() {
        String str = "Hello my name is Alex";

        if (str.equals("Hello my name is ALEX")) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }


        if (str.equalsIgnoreCase ("Hello my name is ALEX")){
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }
}
