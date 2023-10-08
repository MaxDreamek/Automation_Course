package homeworks;

public class Training {
    public static boolean isLove(final int flower1, final int flower2) {
        if((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower2 % 2 == 0 && flower1 % 2 != 0)){
            return true;
        } else return false;
    }
    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpace("Sasda asdasd asd as asda das a"));
    }
}

