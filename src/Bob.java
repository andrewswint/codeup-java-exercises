import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk to Bob");
        String userInput = scanner.nextLine();

        do {
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.equals(userInput.toUpperCase())) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            userInput = scanner.nextLine();
        } while (!userInput.equals("goodbye"));
    }
}
