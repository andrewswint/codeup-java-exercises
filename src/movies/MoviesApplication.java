package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

//    adding a movie to the array
    public static Movie[] addMovie(Movie[] newMovies, Movie newMovie) {
        newMovies = Arrays.copyOf(newMovies, newMovies.length + 1);
        newMovies[newMovies.length - 1] = newMovie;
        return newMovies;
    }

    public static void main(String[] args) throws Exception {

        Movie[] newMovies = MoviesArray.findAll();
        Input input = new Input();
        System.out.println("What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add a movie");
        int userInput = input.getInt();
        while (true) {
            if (userInput == 0) {
                return;
            } else if (userInput == 1) {
                for (Movie mov : newMovies) {
                    System.out.println(mov.getName() + " -- " + mov.getCategory());
                }
            } else if (userInput == 2) {
                for (Movie mov : newMovies) {
                    if (mov.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(mov.getName());
                    }
                }
            } else if (userInput == 3) {
                for (Movie mov : newMovies) {
                    if (mov.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(mov.getName());
                    }
                }
            } else if (userInput == 4) {
                for (Movie mov : newMovies) {
                    if (mov.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(mov.getName());
                    }
                }
            } else if (userInput == 5) {
                for (Movie mov : newMovies) {
                    if (mov.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(mov.getName());
                    }
                }
            } else if (userInput == 6) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter the movie name...");
                String nameInput = sc.next();
                System.out.println("Please enter the movie category...");
                String categoryInput= sc.next();
//                adding the movie and reassigning the newMovies array
                Movie newInput = new Movie (nameInput, categoryInput);
                newMovies = addMovie(newMovies, newInput);
            }
            System.out.println("=====================\nWhat would you like to do?\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add a movie");
            userInput = input.getInt();
        }
    }

}
