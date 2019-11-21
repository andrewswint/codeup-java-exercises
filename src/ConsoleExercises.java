import java.util.Scanner;
public class ConsoleExercises {
    public static void main (String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter(",");

        System.out.println("Please enter an integer...");
        int userInput = scanner.nextInt();
        System.out.printf("%s%n", userInput);
//
        scanner.nextLine();

        System.out.println("Please enter three words...");
        String one = scanner.next();
        String two = scanner.next();
        String three = scanner.next();
        System.out.printf("%s%n", one);
        System.out.printf("%s%n", two);
        System.out.printf("%s%n", three);

        scanner.nextLine();


        System.out.println("Please enter a sentence");
        String sentence = scanner.nextLine();
        System.out.printf("%s%n", sentence);
//
        System.out.println("What is the length of the classroom?");
        String length = scanner.nextLine();
        float numLength = Float.parseFloat(length);
        System.out.println("What is the width of the classroom?");
        String width = scanner.nextLine();
        float numWidth = Float.parseFloat(width);
        System.out.println("What is the height of the classroom?");
        int height = scanner.nextInt();
        System.out.printf("area: %.2f%n", numLength * numWidth);
        System.out.println("perimeter: " + ((numLength * 2) + (numWidth * 2)));
        System.out.println("volume: " + (numLength * numWidth * height));


    }
}
