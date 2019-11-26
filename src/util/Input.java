package util;
import org.w3c.dom.ls.LSOutput;

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

    public int getInt() {
        System.out.println("Please enter a number between 1 and 10");
        int newInput = sc.nextInt();
        System.out.println(newInput);
        return newInput;
    }

    public double getDouble (double min, double max) {
        System.out.println("Please enter a number between 1 and 2");
        String newString = "Great! Your number is in range!";
        double newInput = sc.nextDouble();
        do {
            if (newInput < max && newInput > min) {
                System.out.println("Great! " + newInput + " is in range!");
                continue;
            } else {
                System.out.println("Do better. Please enter a number between 1 and 10");
            } newInput = sc.nextDouble();
        } while (newInput > max || newInput < min);
        return newInput;
    }

    public double getDouble() {
        System.out.println("Please enter a number between 1 and 10");
        double newInput = sc.nextDouble();
        System.out.println(newInput);
        return newInput;
    }


    public static void main(String[] args) {
        Input input = new Input();
//        input.getInt(1,10);
//        input.getInt();
//        input.getDouble(1, 2);
//        input.getDouble();

    }

}
