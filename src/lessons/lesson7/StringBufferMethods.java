package lessons.lesson7;

public class StringBufferMethods {
    public static void main(String[] args) {
        String str = "0123456789";
        StringBuffer stringBuffer = new StringBuffer(str);

        System.out.println(stringBuffer.substring(3));
        System.out.println(stringBuffer.substring(4,8));
        System.out.println(stringBuffer.replace(3,5, "ABCDE"));

        stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
        stringBuffer.reverse();

        System.out.println(stringBuffer.delete(5,9));
        System.out.println(stringBuffer.deleteCharAt(1));
        System.out.println(stringBuffer.insert(1, "One"));


        StringBuilder stringBuilder = new StringBuilder(str);
    }
}
