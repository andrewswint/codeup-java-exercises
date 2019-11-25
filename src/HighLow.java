import java.util.Random;
import java.util.Scanner;
public class HighLow {
    static Scanner scanner = new Scanner(System.in);
    static int randomNum = new Random().nextInt(100) + 1;
    public static void guess () {

        System.out.println("Guess a number from 1 to 100...");
        int userInput = scanner.nextInt();
        if (userInput == randomNum) {
            System.out.println("Good Guess!");
        } else if (userInput > randomNum) {
            System.out.println("Lower...");
            guess();
        } else if (userInput < randomNum) {
            System.out.println("Higher...");
            guess();
        }
    };
    public static void main (String[] args) {
        guess();
    }
}
