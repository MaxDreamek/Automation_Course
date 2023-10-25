package lessons.lesson15.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    static List<String> myList = new LinkedList<>();
    public static void main(String[] args) {
        addMethod(myList);
        addByIndex(myList, 1);
        getByIndex(myList,0);
        indexOfMethod(myList, "Kostya");
        indexOfMethod(myList, "Sasha");
        setMethod(myList, 0, "Sasha");
        removeMethodByIndex(myList, 0);
        removeMethodByObject(myList, "Maks");
        System.out.println(myList.size());
    }
    public static void addMethod(List<String> someList){
        someList.add("Alex");
        someList.add("Kostya");
        System.out.println(someList);
    }
    public static void addByIndex(List<String> someList, int index){
        someList.add(index,"Maks");
        System.out.println(someList);
    }
    public static void getByIndex(List<String> someList, int index){
        System.out.println(someList.get(index));
    }
    public static void indexOfMethod(List<String> someList, String element){
        System.out.println(someList.indexOf(element));
    }
    public static void setMethod(List<String> someList, int index, String element){
        someList.set(index, element);
        System.out.println(someList);
    }
    public static void removeMethodByIndex(List<String> someList, int index){
        someList.remove(index);
        System.out.println(someList);
    }
    public static void removeMethodByObject(List<String> someList, String element){
        someList.remove(element);
        System.out.println(someList);
    }

}
