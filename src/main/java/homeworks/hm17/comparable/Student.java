package homeworks.hm17.comparable;

public class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student second) {
        return Double.compare(second.averageGrade, this.averageGrade);
    }

    @Override
    public String toString() {
        return  "Студент " + name  +
                " средний бал " + averageGrade;
    }
}
