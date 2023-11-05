package homeworks.hm20;

import homeworks.hm20.burgerenums.BurgerPart;
import homeworks.hm20.burgerenums.BurgerSize;

import java.util.Scanner;

public class BurgerSizeSelection {
    private final String hello = "Для выбора размера Бургера введите соответствующую цифру: ";

    public BurgerSize sizeSelectionMethod() throws WrongBurgerArgumentException {
        BurgerUtilsMethods.contactWithUser(hello);
        BurgerUtilsMethods.contactWithUser(BurgerUtilsMethods.ChooseOffer(BurgerPart.BURGER_SIZE));
        Scanner scanner = new Scanner(System.in);
        BurgerSize selectSize = null;
        while (selectSize == null) {
            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1 -> selectSize = BurgerSize.SMALL;
                    case 2 -> selectSize = BurgerSize.MEDIUM;
                    case 3 -> selectSize = BurgerSize.LARGE;
                    default -> {
                        BurgerUtilsMethods.contactWithUser("Вы ввели неверное значение , введите пожалуйста цифру с размером Бургера \n"
                                + BurgerUtilsMethods.ChooseOffer(BurgerPart.BURGER_SIZE));
                    }
                }
            } else {
                throw new WrongBurgerArgumentException("Вы ввели не корректное значение");
            }
        }
        printSelectedSizeWithNullCheck(selectSize);
        return selectSize;
    }

    private void printSelectedSizeWithNullCheck(BurgerSize size) {
        if (size != null) {
            BurgerUtilsMethods.contactWithUser("Вы выбрали размер " + size);
        }
    }
}
