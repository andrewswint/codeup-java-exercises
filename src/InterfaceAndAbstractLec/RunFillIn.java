package InterfaceAndAbstractLec;

public class RunFillIn {

    public static void main(String[] args) {

//        array to fill in constructor
        String[] words = {"Fer", "Pink", "Shirt", "The shirt store"};

//        creates instance of FillInVersion1
        FillInVersion1 version1 = new FillInVersion1(words);

        System.out.println("Once upon a time...");
        System.out.println("There was a person named... ");
        System.out.println(version1.name);
        System.out.println(version1.goToLocation());
        System.out.println("He saw the manager and said...");
        System.out.println(version1.greeting());
        System.out.println("\"I would like to buy that \"");
        System.out.println(version1.color + " " + version1.randomObject);
        System.out.println(version1.pickUpObject());
        System.out.println("Then he left.");

    }

}
