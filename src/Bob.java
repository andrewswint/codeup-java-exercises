import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk to Bob");
        String userInput = scanner.nextLine();
//        do {
//            System.out.println("Sure.");
//        } while (userInput.endsWith("?"));
//        do {
//            System.out.println("Whoa, chill out!");
//        } while (userInput.equals(userInput.toUpperCase()));
//        do {
//            System.out.println("Fine. Be that way!");
//        } while (userInput.equals(""));
//        do {
//            System.out.println("Whatever.");
//        } while (userInput.equals(userInput));

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
            System.out.println("Talk to Bob");
            userInput = scanner.nextLine();
        } while (!userInput.equals("stop"));
    }
}
