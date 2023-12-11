package lesson30.predicateExample;

import java.util.function.Predicate;

public class ForTest {
    public static void main(String[] args) {
        IMyPredicate myPredicate = new IMyPredicate() {
            @Override
            public boolean test(Integer value) {
                return value > 0;
            }
        };
        System.out.println(myPredicate.test(5));

        IMyPredicate myPredicate1 = x -> x > 0;
        myPredicate = value -> {
            return value > 0;
        };
        System.out.println(myPredicate1.test(10));


    Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(3));
    }

}
