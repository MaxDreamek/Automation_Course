package homeworks.hm20;

import homeworks.hm20.burgerenums.BurgerPart;
import homeworks.hm20.burgerenums.BurgerSize;
import homeworks.hm20.burgerenums.Ingredient;
import homeworks.hm20.burgerenums.MeatType;

import java.util.*;

public class BurgerUtilsMethods {
    public static void contactWithUser(String contact) {
        System.out.println(contact);
    }

    public static String ChooseOffer(BurgerPart burgerPart) {
        StringBuffer stringBuffer = new StringBuffer();
        switch (burgerPart){
            case MEAT_TYPE -> makeMeatTypeString(stringBuffer);
            case BURGER_SIZE -> makeSizeTypeString(stringBuffer);
            case INGREDIENT -> makeIngredientTypeString(stringBuffer);
        }
        return String.valueOf(stringBuffer);
    }
    private static void makeMeatTypeString(StringBuffer stringBuffer){
        MeatType[] types = MeatType.values();
        for (int i = 0; i < types.length; i++) {
            stringBuffer.append(" ").append(i + 1).append(" - для выбора ")
                    .append(types[i].name()).append(" ").append(types[i].price).append("$");
            if (i < types.length - 1) {
                stringBuffer.append("\n");
            }
        }
    }
    private static void makeSizeTypeString(StringBuffer stringBuffer){
        BurgerSize[] burgerSizes = BurgerSize.values();
        for (int i = 0; i < burgerSizes.length; i++) {
            stringBuffer.append(" ").append(i + 1).append(" - для выбора размера ")
                    .append(burgerSizes[i].name()).append(" ").append(burgerSizes[i].price).append("$");
            if (i < burgerSizes.length - 1) {
                stringBuffer.append("\n");
            }
        }
    }
    private static void makeIngredientTypeString(StringBuffer stringBuffer){
        Ingredient[] ingredients = Ingredient.values();
        for (int i = 0; i < ingredients.length; i++) {
            stringBuffer.append(" ").append(i + 1).append(" - для добавки ")
                    .append(ingredients[i].name()).append(" ").append(ingredients[i].price).append("$");
            if (i < ingredients.length - 1) {
                stringBuffer.append("\n");
            }
        }
    }

    public static String ingredientToString(Set<Ingredient> list) {
        List<Ingredient> arrayListlist = new ArrayList<>(list);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayListlist.size(); i++) {
            stringBuffer.append(arrayListlist.get(i));
            if(i < arrayListlist.size() - 1){
                stringBuffer.append(", ");
            }
        }
        return String.valueOf(stringBuffer);
    }
}
