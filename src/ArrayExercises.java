public class ArrayExercises {


    public static void main (String[] args) {

        // Creation of person objects
        Person person1 = new Person("Andrew");
        person1.relationship = "Self";
        Person person2 = new Person("Angela");
        person2.relationship = "wife";
        Person person3 = new Person("Mike");
        person3.relationship = "friend";

        // Creation of array of persons
        Person obj[] = new Person[3];
        obj[0] = person1;
        obj[1] = person2;
        obj[2] = person3;

        // Iteration through array of persons to print names

        // not working!!!
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].getName());
        }

    }
}

