package lessons.lesson16.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSaleIterator {
    public static void main(String[] args) {
        List<Integer> myList = new CopyOnWriteArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        System.out.println("Before iteration " +  myList);

        Iterator<Integer> myIterator = myList.iterator();
        while (myIterator.hasNext()){
            Integer nextValue = myIterator.next();
            if(nextValue.equals(5)){
                myList.remove(1);
            }

        } System.out.println("After iteration " + myList);
    }
}
