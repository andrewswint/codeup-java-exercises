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

        System.out.println("Please enter an integer...");
        int userInput = scanner.nextInt();
        int i;
        System.out.println("Here is your table\n ------ \n");
        System.out.println("number  | squared  |  cubed");
        System.out.println("---------------------------");

        for (i = 1; i <= userInput; i++) {
            System.out.print(i+ "         |" + i*i + "         |" + i*i*i+ "\n");
        }


//        for (int y = 1; y < userInput; y*=(y*y)) {
//            System.out.println(y);
//        }

//            System.out.printf("%s      | %s     | %s", i, x, y);


//        System.out.println("Please enter a number between 1-100...");
//        int grade = scanner.nextInt();
//        for (int i = 0; i <= 100; i++) {
//            if (grade >= 88) {
//                System.out.println("A");
//                break;
//            } else if (grade >= 80 && grade <= 87) {
//                System.out.println("B");
//                break;
//            } else if (grade >= 67 && grade <= 79) {
//                System.out.println("C");
//                break;
//            } else if (grade >= 60 && grade <= 66) {
//                System.out.println("D");
//                break;
//            } else {
//                System.out.println("F");
//                break;
//            }
//        }
    }
}

