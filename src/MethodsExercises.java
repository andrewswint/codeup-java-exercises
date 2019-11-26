import java.util.Random;
import java.util.Scanner;
public class MethodsExercises {
        public static int addition(int one, int two) {
        return (one + two);
    }
    public static int subtraction (int one, int two) {
        return (one - two);
    }
    public static int multiplication (int one, int two) {
        return (one * two);
    }
    public static int division (int one, int two) {
        return (one / two);
    }
    public static int mod (int one, int two) {
        return (one / two);
    }
     public static int minMax(int min, int max) {
            System.out.println("Please enter a number between 1 and 10");
            Scanner scanner = new Scanner(System.in);
            String newString = "Great! Your number is in range!";
            int newInput = scanner.nextInt();
            do {
                if (newInput < max && newInput > min) {
                    System.out.println("Great! " + newInput + " is in range!");
                    continue;
                } else {
                    System.out.println("Do better. Please enter a number between 1 and 10");
                } newInput = scanner.nextInt();
            } while (newInput > max || newInput < min);
            return newInput;
        }

    public static int loopMult (int one, int two) {
        int newOne = 0;
        for (int i = 0; i < two; i++) {
            newOne += one;
        }
        return newOne;
    }
    public static long recusionMult(int one, int two) {
        if (two == 0) {
            return 0;
        } else if (two == 1) {
            return one;
        } else if (two == 2) {
            return one + one;
        }
        return one + recusionMult(one, two - 1);
    }

    static Scanner scanner = new Scanner(System.in);
    public static int factorial () {
        System.out.println("Please enter a number between 1 and 10");
        int userInput = scanner.nextInt();
        System.out.println(userInput);
        if (userInput <= 10 && userInput >= 0) {
            System.out.println("Do you want to continue?");
            String newInput = scanner.next();
            if (newInput.equalsIgnoreCase("yes")) {
                for (int i = userInput - 1; i > 0; i--) {
                    userInput *= i;
                }
            }
        } else {
            return factorial();
        }
        return userInput;
    }

    public static void dice () {
        System.out.println("Please enter how many sides your dice has...");
        int userInput = scanner.nextInt();
        System.out.println(userInput);
        System.out.println("Roll...yes or no");
        String roll = scanner.next();
        if (roll.equalsIgnoreCase("yes")) {
            for (int i = 0; i < 2; i++) {
                Random diceRoll = new Random();
                int randomRandom = diceRoll.nextInt(userInput) + 1;
                System.out.println(randomRandom);
            }
            } else {
                dice();
            }
    }

    public static void main(String[] args) {
//        System.out.println(addition(1,1));
//        System.out.println(subtraction(2,1));
//        System.out.println(multiplication(2,2));
//        System.out.println(division(4,2));
//        System.out.println(mod(4,3));
//        System.out.println(loopMult(2, 2));
//        System.out.println(recusionMult(5, 7));
//        System.out.println(minMax(1,10));
//        System.out.println(factorial());
        dice();
    }
}
