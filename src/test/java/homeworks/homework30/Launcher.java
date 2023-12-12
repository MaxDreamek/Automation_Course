package homeworks.homework30;


import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 22));
        personList.add(new Person("Charlie", 28));
        personList.add(new Person("David", 26));

        personList.stream().filter(x -> x.getAge() > 25)
                .sorted((p1, p2) -> String.CASE_INSENSITIVE_ORDER.compare(p1.getName(), p2.getName()))
                .map(x -> x.getName() + " " + x.getAge())
                .forEach(System.out::println);
    }
}
