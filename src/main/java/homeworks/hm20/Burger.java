package homeworks.hm20;

import homeworks.hm20.burgerenums.BurgerSize;
import homeworks.hm20.burgerenums.Ingredient;
import homeworks.hm20.burgerenums.MeatType;

import java.util.Set;

public class Burger extends BurgerCalculating {
    private final BurgerSize burgerSize;
    private final Set<Ingredient> ingredient;
    private final MeatType meatType;

    public Burger(BurgerSize burgerSize, MeatType meatType, Set<Ingredient> ingredient) {
        this.burgerSize = burgerSize;
        this.ingredient = ingredient;
        this.meatType = meatType;
    }

    public BurgerSize getBurgerSize() {
        return burgerSize;
    }

    public Set<Ingredient> getIngredient() {
        return ingredient;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void printInformationAboutBurger() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Ваш бургер размера ").append(this.burgerSize).append(" c ").append(meatType).append(" мясом.");
        stringBuffer.append(" В бургер входят такие добавки: ").append(BurgerUtilsMethods.ingredientToString(ingredient)).append(".");
        stringBuffer.append(" Общая стоимость ").append(getFinalBurgerPrice(this.burgerSize, this.ingredient, this.meatType)).append("$");
        System.out.println(stringBuffer);
    }
}
