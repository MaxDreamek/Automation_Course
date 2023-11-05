package homeworks.hm20;



public class UserUsing {
    public static void main(String[] args) throws WrongBurgerArgumentException {
        UserUsing userUsing = new UserUsing();
        userUsing.makeBurger();
    }

    public void makeBurger() throws WrongBurgerArgumentException {
        BurgerSizeSelection size = new BurgerSizeSelection();
        BurgerMeatSelection meat = new BurgerMeatSelection();
        BurgerIngredientSelection ingredient = new BurgerIngredientSelection();

        Burger burger = new Burger(size.sizeSelectionMethod(), meat.typeOfMeatSelectionMethod(), ingredient.ingredientsSelectionMethod());
        burger.printInformationAboutBurger();
    }

}
