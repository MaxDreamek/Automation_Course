package lessons.lesson16.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {


    public static void main(String[] args) {
        SortedSet<String> mySortedSet = new TreeSet<>();
        mySortedSet.add("C");
        mySortedSet.add("A");
        mySortedSet.add("D");
        mySortedSet.add("R");
        mySortedSet.add("Y");
        mySortedSet.add("B");
        mySortedSet.add("X");
        mySortedSet.add("N");
        mySortedSet.add("O");
        mySortedSet.add("2");
        mySortedSet.add("123");
        mySortedSet.add("*");
        mySortedSet.add("_");

        System.out.println(mySortedSet);

        SortedSet<Integer> mySortedSet2 = new TreeSet<>();
        mySortedSet2.add(2);
        mySortedSet2.add(123);
        mySortedSet2.add(0);
        mySortedSet2.add(-2);
        mySortedSet2.add(Integer.MIN_VALUE);
        mySortedSet2.add(Integer.MAX_VALUE);

        System.out.println(mySortedSet2);
    }
}
