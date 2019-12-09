package fileIOLec;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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
//                    Files.createDirectories(path);
                    Files.createFile(path);
                } catch (IOException e) {
                    //this is what happens if there is an exception
                    e.printStackTrace();
                }
            }

            List<String> instructors = new ArrayList<>();
            instructors.add("fer");
            instructors.add("david");
            instructors.add("vivian");

//            Writes the above information onto file and overwrites everything
//            try {
//                Files.write(path, instructors);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

//            Writes the above information onto file and adds it to the end of information that already exists in the file
            try {
                Files.write(path, instructors,StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }



//            reads the information in the file. modifications are only local and do not affect the information in the file.
            try {
                List<String> lines = Files.readAllLines(path);
                for (String line : lines) {
                    System.out.println("line.toUpperCase() = " + line.toUpperCase());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


