import java.util.Scanner;
public class MethodsExercises {
//    public static int addition(int one, int two) {
//        return (one + two);
//    }
//    public static int subtraction (int one, int two) {
//        return (one - two);
//    }
//    public static int multiplication (int one, int two) {
//        return (one * two);
//    }
//    public static int division (int one, int two) {
//        return (one / two);
//    }
//    public static int mod (int one, int two) {
//        return (one / two);
//    }
    public static int minMax (int min, int max) {
        System.out.println("Please enter a number between 1 and 10...");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        do {
            if (userInput < min && userInput > max) {
                System.out.println("try again");
                System.out.println("great");
                userInput = scanner.nextInt();
            } else {
            }
        } while (userInput < min || userInput > max);
        return userInput;
    }

//    public static void loopMult (int one, int two) {
////        int newOne = 0;
////        for (int i = 0; i < two; i++) {
////            newOne += one;
////        }
////        return newOne;
//    }
//public static void loopMult(int one, int two) {
//    if (two <= 0) {
//        System.out.println("All done!");
//        return;
//    }
//
//    loopMult(one + two);
//}




    public static void main (String[] args) {
//        System.out.println(addition(1,1));
//        System.out.println(subtraction(2,1));
//        System.out.println(multiplication(2,2));
//        System.out.println(division(4,2));
//        System.out.println(mod(4,3));
//        System.out.println(loopMult(2,2));
        System.out.println(minMax(1,10));
    }
}
