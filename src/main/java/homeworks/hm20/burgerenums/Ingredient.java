package homeworks.hm20.burgerenums;

public enum Ingredient {
    CHEESE(1),
    TOMATO(1.5),
    LETTUCE(2.0),
    ONION(0.5),
    CUCUMBER(1),
    POTATO(1.5),
    SALAD(0.7);


    public final double price;

    Ingredient(double price) {
        this.price = price;
    }
}
