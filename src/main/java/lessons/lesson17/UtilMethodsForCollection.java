package lessons.lesson17;

import java.util.*;

public class UtilMethodsForCollection {
    public static void main(String[] args) {
        sortMethod();
        shuffleMethod();
        minMaxMethod();
        System.out.println();
        frequencyMethod();
    }
    public static void asListMethod() {
        String[] arr = {"food", "bar", "baz"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
    public static void sortMethod() {
        List<String> colorList = Arrays.asList("Красный", "Желтый", "Синий");
        System.out.println("Коллекция до сортировки " + colorList);
        Collections.sort(colorList);
        System.out.println("Коллекция после сортировки " + colorList);

        colorList.sort(Collections.reverseOrder());
        System.out.println("Коллекция после reverseOrder " + colorList);

        Collections.reverse(colorList);
        System.out.println("Коллекция после reverseOrder " + colorList);
    }

    public static void shuffleMethod() {
        List<String> colorList = Arrays.asList("Красный", "Желтый", "Синий");
        Collections.shuffle(colorList);
        System.out.println("Коллекция после shuffle " + colorList);

    }

    public static void minMaxMethod() {
        List<Integer> list = Arrays.asList(12, 34, 56, 87, 2, 4, 6, 7);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
    public static void frequencyMethod() {
        List<Integer> list = Arrays.asList(12, 34, 56, 87, 2, 4, 6, 7, 2,2,2, 2);
        System.out.println(Collections.frequency(list, 2));
    }
}
