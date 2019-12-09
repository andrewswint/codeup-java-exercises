package fileIOLec;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceryApp {

    //paths should be static (and final, if you'd like) because they shouldn't move
    final static String folder = "data";
    //creating arbitrary file
    final static String fileName = "groceries.txt";

    //    make the list
    static List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");

//    Create Read Update Delete (CRUD) app.

    public static void main(String[] args) {

//        Creates the path
        Path dataDirectory = Paths.get(folder);
        Path dataFile = Paths.get(folder, fileName);

//        creates file and directory if one or both dont already exist.
        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            //      adds the information to the file.
            Path filepath = Paths.get("data", "groceries.txt");
            Files.write(filepath, groceryList);

//            adds eggs to the list.
            Files.write(
                    Paths.get("data", "groceries.txt"),
                    Arrays.asList("eggs"), // list with one item
                    StandardOpenOption.APPEND
            );

//            creates a list with the information from the file. has nothing to do with the original array.
            List<String> linesFromFile = Files.readAllLines(filepath);

            for(int i = 0; i < linesFromFile.size(); i += 1) {
                System.out.println((i + 1) + ": " + linesFromFile.get(i));
            }

//            update a line or modify. makes a temporary list to go through each line and adds everything except whats in the conditional. items can also be added as a modification.
            List<String> tempList = new ArrayList<>();
            for (String line : linesFromFile) {
                if (line.equals("milk")) {
                    tempList.add("cream");
                    continue;
                }

//                deletes item from the file.
                if (line.equals("eggs")) {
                    continue;
                }

                tempList.add(line);
            }

            Files.write(filepath, tempList);


        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }

}
