package homeworks.hm20.burgerenums;

public enum BurgerSize {
    SMALL(3.00),
    MEDIUM(5.0),
    LARGE(8.0);

    public final double price;

    BurgerSize(double price) {
        this.price = price;
    }
}
