package homeworks.hm20;

import homeworks.hm20.burgerenums.BurgerSize;
import homeworks.hm20.burgerenums.Ingredient;
import homeworks.hm20.burgerenums.MeatType;

import java.util.Set;

public class BurgerCalculating {
    final double basicPriceOfBurger = 5;

    public double getFinalBurgerPrice(BurgerSize burgerSize, Set<Ingredient> ingredients, MeatType meatType) {
        return basicPriceOfBurger + burgerSize.price + getIngredientsCost(ingredients) + meatType.price;
    }

    public double getIngredientsCost(Set<Ingredient> ingredientSet) {
        double ingredientsCost = 0;
        for (Ingredient ingredient : ingredientSet) {
            ingredientsCost += ingredient.price;
        }
        return ingredientsCost;
    }
}
