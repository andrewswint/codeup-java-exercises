package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main (String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Andrew");
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(95);

        Student student2 = new Student("Jacob");
        student2.addGrade(93);
        student2.addGrade(87);
        student2.addGrade(98);

        Student student3 = new Student("Chris");
        student3.addGrade(100);
        student3.addGrade(80);
        student3.addGrade(85);

        Student student4 = new Student("Bryan");
        student4.addGrade(95);
        student4.addGrade(92);
        student4.addGrade(97);

        students.put("haha", student1);
        students.put("hoho", student2);
        students.put("hehe", student3);
        students.put("hayhay", student4);

    }

}
