import java.util.Scanner;

public class StringsLecStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter your name:");

        String input = sc.next();

        String name = "Jane Doe";

        /*
         *  TO DO: Write the control statements below to check the input
         *  String using Java methods.
         */
        //  If the input is an exact match to String name...
        //  Print message: "Welcome Jane Doe!"

        if (input.equals(name)) {
            System.out.println("Welcome Jane Doe!");
        }

        //  If the input is not capitalized correctly...
        //  Print message: "Names are proper nouns."

        if (input.equals("jane doe")) {
            System.out.println("Names are proper nouns.");
        }

        //  If the input starts with "Jane"...
        //  Print message: "Hi Jane!"

        if (input.startsWith("Jane")) {
            System.out.println("Hi Jane!");
        }

        //  If the input ends with "Doe"...
        //  Print message: "Doe, a deer..."

        if (input.endsWith("Doe")) {
            System.out.println("Doe, a deer...");
        }


        /*
         *  TO DO TOGETHER: Uncomment each line and view the results of each
         *  String manipulation method.
         */

        System.out.println(name.charAt(3));
//        The character at index 3 (returns character)
        System.out.println(name.indexOf("Doe"));
//        Index of where the substring starts(index)
        System.out.println(name.lastIndexOf("e"));
//        index of the last instance(index)
        System.out.println(name.length());
//        returns length as int
        System.out.println(name.replace("Doe", "Smith"));
//        changes last name
        System.out.println(name.substring(3));
//        returns substring starting at index 3
        System.out.println(name.substring(0,3));
//        returns substring starting at index 0 ending just before index 3
        System.out.println(name.toLowerCase());
//        changes all to lower case
        System.out.println(name.toUpperCase());
//        changes all to uppercase


        // trim is really useful for catching user errors on input.
        String trimThis = "    too many spaces   ";

        System.out.println(trimThis);
        System.out.println(trimThis.trim());

//         How would we fix this?
        System.out.println("Here is a backslash \\");

    }
}