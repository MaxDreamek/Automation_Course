package homeworks.hm20;

import homeworks.hm20.burgerenums.BurgerPart;
import homeworks.hm20.burgerenums.Ingredient;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BurgerIngredientSelection {
    public Set<Ingredient> ingredientsSelectionMethod() throws WrongBurgerArgumentException {
        BurgerUtilsMethods.contactWithUser("Для выбора добавок в ваш бургер выберите соответствующую цифру:");
        BurgerUtilsMethods.contactWithUser(BurgerUtilsMethods.ChooseOffer(BurgerPart.INGREDIENT));
        BurgerUtilsMethods.contactWithUser("Для завершения заказа введите слово Готово");

        Set<Ingredient> ingredientList = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        while (!result.equalsIgnoreCase("Готово")) {
            switch (result) {
                case "1" -> {
                    addIngredient(ingredientList, Ingredient.CHEESE);
                }
                case "2" -> {
                    addIngredient(ingredientList, Ingredient.TOMATO);
                }
                case "3" -> {
                    addIngredient(ingredientList, Ingredient.LETTUCE);
                }
                case "4" -> {
                    addIngredient(ingredientList, Ingredient.ONION);
                }
                case "5" -> {
                    addIngredient(ingredientList, Ingredient.CUCUMBER);
                }
                case "6" -> {
                    addIngredient(ingredientList, Ingredient.POTATO);
                }
                case "7" -> {
                    addIngredient(ingredientList, Ingredient.SALAD);
                }
                default ->
                        System.out.println("Вы ввели неверное значение введите цифру желаемой добавки или Готово для завершения заказа");
            }
            result = scanner.nextLine();
        }
        if (result.equalsIgnoreCase("Готово") && ingredientList.isEmpty()) {
            throw new WrongBurgerArgumentException("Вы не добавили ни одного ингредиента");
        }
        BurgerUtilsMethods.contactWithUser("Вы выбрали добавки " + BurgerUtilsMethods.ingredientToString(ingredientList));
        return ingredientList;
    }

    private void addIngredient(Set<Ingredient> listWithIngredients, Ingredient ingredient) {
        if (listWithIngredients.isEmpty()) {
            addElementToEmptyCollection(listWithIngredients, ingredient, true);
        } else {
            checkCollectionForDuplicateAndAddElement(listWithIngredients, ingredient);
        }
    }

    private void addElementToEmptyCollection(Set<Ingredient> set, Ingredient i, boolean isNeedMessage) {
        if (set.isEmpty()) {
            set.add(i);
            if (isNeedMessage) {
                successAddedElement(i);
            }
        }
    }

    private void successAddedElement(Ingredient something) {
        System.out.println("Вы добавили " + something);
    }

    private void checkCollectionForDuplicateAndAddElement(Set<Ingredient> set, Ingredient ingredient) {
        boolean isAdded = false;
        Ingredient newIngredient = null;
        for (Ingredient i : set) {
            if (i.equals(ingredient)) {
                isAdded = true;
                BurgerUtilsMethods.contactWithUser("Вы уже добавили выбранный ингредиент");
                break;
            } else {
                newIngredient = ingredient;
            }
        }
        if (newIngredient != null && !isAdded) {
            set.add(newIngredient);
            successAddedElement(ingredient);
        }
    }
}
