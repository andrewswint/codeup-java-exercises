import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//
//        System.out.println("Please enter an integer...");
//        int userInput = scanner.nextInt();
//        int i;
//        System.out.println("Here is your table\n ------ \n");
//        System.out.println("number  | squared  |  cubed");
//        System.out.println("--------|----------|-------");
//
//        for (i = 1; i <= userInput; i++) {
//            System.out.print(i+ "         " + i*i + "         " + i*i*i+ "\n");
//        }


        System.out.println("Please enter a number between 1-100...");
        int grade = scanner.nextInt();
            if (grade >= 88) {
                System.out.println("A");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("B");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("C");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

        System.out.println("Would you like to see another?");
            String confirm = scanner.next();
            while (confirm.equalsIgnoreCase("yes")) {
                System.out.println("Please enter a number between 1-100...");
                grade = scanner.nextInt();

                if (grade >= 88) {
                    System.out.println("A");
                } else if (grade >= 80 && grade <= 87) {
                    System.out.println("B");
                } else if (grade >= 67 && grade <= 79) {
                    System.out.println("C");
                } else if (grade >= 60 && grade <= 66) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }
                System.out.println("Would you like to see another?");
                confirm = scanner.next();
            }
    }
}

