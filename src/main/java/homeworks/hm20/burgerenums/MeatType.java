package homeworks.hm20.burgerenums;

public enum MeatType {
    BEEF(7.00),
    CHICKEN(5.0),
    FISH(3.0),
    PORK(6.0),
    MUTTON(5.0),
    RABBIT(10.0);

    public final double price;

    MeatType(double price) {
        this.price = price;
    }
}
