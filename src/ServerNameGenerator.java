import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

//    int random = (int) Math.floor(Math.random() * (10 - 1)) + 1;

    public static String output (String[] arrayString) {
        Random random = new Random();
//        int random = (int) Math.random() * arrayString.length
        int index = random.nextInt(arrayString.length);
        return arrayString[index];
    }


    public static void main (String[] args) {
        String[] verb = new String[] {"running", "flying", "jumping", "hopping", "sitting", "typing", "watching", "sipping", "eating", "coding"};

        String[] noun = new String[] {"Europe", "Codeup", "San Antonio", "home", "Italy", "Hawaii", "San Diego", "Jacob", "Sophie", "David"};

        System.out.println("here is your server name: \n" + output(verb) + " "+ output(noun));
    }

}
