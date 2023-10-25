package lessons.lesson16.set;

import java.util.*;

public class HashSetExample {
    static HashSet<String> mySet = new HashSet<>();

    public static void main(String[] args) {
        addMethodExample(mySet);
        removeMethodExample(mySet, "Alex");
        containsMethodExample(mySet, "Igor");
        containsMethodExample(mySet, "Elena");
        sizeMethodExample(mySet);
        clearMethodExample(mySet);
        isEmptyMethodExample(mySet);
        howGetSet(mySet, 0);
    }
    static void addMethodExample(Set<String> someSet) {
        someSet.add("Alex");
        someSet.add("Alex");
        someSet.add("Maks");
        someSet.add("Igor");
        System.out.println(someSet);
    }
    static void removeMethodExample(Set<String> someSet, String removeObject) {
        System.out.println("Before remove " + someSet);
        someSet.remove(removeObject);
        System.out.println("After removed " + someSet);
    }
    static void containsMethodExample(Set<String> someSet, String containsObj) {
        System.out.println("Set contains " + containsObj +" - " + someSet.contains(containsObj));
    }
    static void sizeMethodExample(Set<String> someSet) {
        System.out.println("Set size is " + someSet.size());
    }
    static void clearMethodExample(Set<String> someSet) {
        System.out.println("Set size before clear " + someSet.size());
        someSet.clear();
        System.out.println("Set size after clear " + someSet.size());
    }
    static void isEmptyMethodExample(Set<String> someSet) {
        System.out.println("Is set empty? " + someSet.isEmpty());
        addMethodExample(someSet);
        System.out.println("Is set empty? " + someSet.isEmpty());
    }
    static void howGetSet(Set<String> someSet, int element){
        List<String> myList = new ArrayList<>(someSet);
        System.out.println("This list from set " + myList.get(element));
    }
}
