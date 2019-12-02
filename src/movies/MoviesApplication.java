package movies;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] newMovies = MoviesArray.findAll();
        Input input = new Input();
        System.out.println("What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        int userInput = input.getInt();
        while (true) {
            if (userInput == 0) {
                return;
            } else if (userInput == 1) {
                for (Movie mov : newMovies) {
                    System.out.println(mov.getName());
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
            }
            System.out.println("=====================\nWhat would you like to do?\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");
            userInput = input.getInt();
        }
    }

}
