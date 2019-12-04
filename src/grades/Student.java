package grades;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.studentName = name;
        this.grades = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {

    }

    public double getGradeAverage() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }
        return sum / grades.size();
    }


    public static void main(String[] args) {

        Student student1 = new Student("Andrew");
        student1.grades.add(90);
        student1.grades.add(80);

        System.out.println("name: " + student1.studentName);
        System.out.println("grade average: " + student1.getGradeAverage());

    }

}