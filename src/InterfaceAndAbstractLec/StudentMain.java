package InterfaceAndAbstractLec;

public class StudentMain {

        public static void main(String[] args) {

//            created array that passes information to CodeupStudent constructor
            String[] student1 = {"Andrew", "Swint", "Deimos", "MacBook Pro",};

//            created an instance of the CodeupStudent class
            CodeupStudent andrew = new CodeupStudent(student1, false);

            andrew.greeting();
            andrew.study();
            System.out.println("is the student giving out cards yet: " + andrew.giveBusinessCards());

        }

}
