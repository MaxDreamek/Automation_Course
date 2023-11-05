package homeworks.hm20;

public class WrongBurgerArgumentException extends Exception {

    public WrongBurgerArgumentException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongBurgerArgumentException " + getMessage();
    }
}
