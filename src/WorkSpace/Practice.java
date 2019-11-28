package WorkSpace;
import java.util.Scanner;

class Practice {

    private Scanner scan = new Scanner(System.in);
    public String getName () {
        System.out.println("Please enter authors name...");
        String authorInput = scan.next();
        System.out.println(authorInput);
        return authorInput;
    }

    public String getEmail () {
        System.out.println("enter email...");
        String authorEmail = scan.next();
        System.out.println(authorEmail);
        return authorEmail;
    }

//    public String book () {
//        getName();
//        getEmail();
//        return book();
//    }



}