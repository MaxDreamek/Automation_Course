package lessons.lesson17.sorting.comparator;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
//    public int compare(Car o1, Car o2) {
//        if(o1.getYear() == o2.getYear()) {
//            return 0;
//        } else if (o1.getYear() < o2.getYear()) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
    }
