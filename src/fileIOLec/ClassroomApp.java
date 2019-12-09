package fileIOLec;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ClassroomApp {


        //paths should be static (and final, if you'd like) because they shouldn't move
        final static String dir = "data";
        //creating arbitrary file
        final static String fileName = "classroom.txt";
        //make sure you set up exceptions as needed
        public static void main(String[] args) {
            //it's useful to set path as a variable
            Path path = Paths.get(dir, fileName);
            //this allows you to see name, etc.
            //lots of functionality with 'Path' variable
            System.out.println(path.getFileName());
            //you can do '!' or "notExists" in this example
            if (!Files.exists(path)){
                try {
                    //this is filled with what you're trying
                    Files.createDirectories(path);
                } catch (IOException e) {
                    //this is what happens if there is an exception
                    e.printStackTrace();
                }
            }

            List<String> instructors = new ArrayList<>();
            instructors.add("fer");
            instructors.add("david");
            instructors.add("vivian");

            try {
                Files.write(path, instructors);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


