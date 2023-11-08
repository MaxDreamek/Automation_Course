package homeworks.hm20;

import homeworks.hm20.burgerenums.BurgerPart;
import homeworks.hm20.burgerenums.MeatType;

import java.util.Scanner;

public class BurgerMeatSelection {
    public static void main(String[] args) throws WrongBurgerArgumentException {
        BurgerMeatSelection meatSelection = new BurgerMeatSelection();
        meatSelection.typeOfMeatSelectionMethod();
    }

    public MeatType typeOfMeatSelectionMethod() throws WrongBurgerArgumentException {
        BurgerUtilsMethods.contactWithUser("Для выбора мяса в ваш бургер выберите соответствующую цифру: ");
        BurgerUtilsMethods.contactWithUser(BurgerUtilsMethods.ChooseOffer(BurgerPart.MEAT_TYPE));
        return userChoose();
    }


    private MeatType userChoose() throws WrongBurgerArgumentException {
        Scanner scanner = new Scanner(System.in);
        MeatType selectMeatType = null;
        while (selectMeatType == null) {
            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1 -> {
                        selectMeatType = MeatType.BEEF;
                    }
                    case 2 -> {
                        selectMeatType = MeatType.CHICKEN;
                    }
                    case 3 -> {
                        selectMeatType = MeatType.FISH;
                    }
                    case 4 -> {
                        selectMeatType = MeatType.PORK;
                    }
                    case 5 -> {
                        selectMeatType = MeatType.MUTTON;
                    }
                    case 6 -> {
                        selectMeatType = MeatType.RABBIT;
                    }
                    default -> {
                        System.out.println("Вы ввели неверное значение , введите пожалуйста цифру с типом мяса \n"
                                + BurgerUtilsMethods.ChooseOffer(BurgerPart.MEAT_TYPE));
                    }
                }
            } else {
                throw new WrongBurgerArgumentException("Вы ввели не корректное значение");
            }
        }
        printSelectedTypeOfMeat(selectMeatType);
        return selectMeatType;
    }

    private void printSelectedTypeOfMeat(MeatType meatType) {
        if (meatType != null) {
            BurgerUtilsMethods.contactWithUser("Вы выбрали бургер с " + meatType + " мясом");
        }
    }
}
