package homeworks.hm17.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Никита", 4.90));
        studentArrayList.add(new Student("Рома", 4.30));
        studentArrayList.add(new Student("Влад", 3.90));
        studentArrayList.add(new Student("Костя", 1.70));
        studentArrayList.add(new Student("Олег", 2.20));
        Collections.sort(studentArrayList);

        for (Student student: studentArrayList) {
            System.out.println(student);
        }
    }
}
