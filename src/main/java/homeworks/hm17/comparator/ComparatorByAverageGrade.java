package homeworks.hm17.comparator;

import java.util.Comparator;

public class ComparatorByAverageGrade implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return Double.compare(secondStudent.getAverageGrade(), firstStudent.getAverageGrade());
    }
}
