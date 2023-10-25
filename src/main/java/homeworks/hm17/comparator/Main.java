package homeworks.hm17.comparator;

import lessons.lesson17.sorting.comparator.Car;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ComparatorByAverageGrade comparatorByAverageGrade = new ComparatorByAverageGrade();
        ArrayList<Student> studentsArrayList = new ArrayList<>();
        studentsArrayList.add(new Student("Игорь", 4.20));
        studentsArrayList.add(new Student("Ваня", 4.57));
        studentsArrayList.add(new Student("Коля", 3.99));
        studentsArrayList.add(new Student("Петя", 2.70));
        studentsArrayList.add(new Student("Вася", 4.11));
        studentsArrayList.sort(comparatorByAverageGrade);

        for (Student student : studentsArrayList) {
            System.out.println(student);
        }

    }
}
