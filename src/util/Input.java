package util;
import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString() {
        return sc.next();
    }

    public boolean yesNo() {
        return (sc.next().equalsIgnoreCase("yes")|| sc.next().equalsIgnoreCase("y"));
    }

    public int getInt (int min, int max) {
        System.out.println("Please enter a number between 1 and 10");
        Scanner sc = new Scanner(System.in);
        String newString = "Great! Your number is in range!";
        int newInput = sc.nextInt();
        do {
            if (newInput < max && newInput > min) {
                System.out.println("Great! " + newInput + " is in range!");
                continue;
            } else {
                System.out.println("Do better. Please enter a number between 1 and 10");
            } newInput = sc.nextInt();
        } while (newInput > max || newInput < min);
        return newInput;
    }

}
