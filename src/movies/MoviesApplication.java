package movies;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        int input = sc.nextInt();
        if (input == 0) {
            return;
        } else if (input == 1) {
            for
            System.out.println(Arrays.toString(MoviesArray.findAll().getName));
//        } else if (input == 2) {
//            System.out.println(Arrays.toString(MoviesArray.));
        }
    }

}
