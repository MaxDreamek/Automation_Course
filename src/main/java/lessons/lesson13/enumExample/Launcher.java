package lessons.lesson13.enumExample;

public class Launcher {
    public static void main(String[] args) {
        String res = gettingCurrency(CountryCurrency.CANADA);
        System.out.println(res);
    }

    public static String gettingCurrency(CountryCurrency countryCurrency) {
        String result = null;
        for (CountryCurrency c :
                CountryCurrency.values()) {
            if (c.equals(countryCurrency)) {
                result = c.currency;
                break;
            }
        }
        return result;
    }

    public static void enumWithConstructor() {
        for (CountryCurrency cc : CountryCurrency.values()) {
            System.out.println(cc + " country currency " + cc.currency);
        }
    }

    public static void enumValueMethod() {
        for (Car c : Car.values()) {
            System.out.println("Method name " + c.name());
            System.out.println(c);
        }
    }

    public static void enumCall() {
        System.out.println(Car.BMW);
    }
}
