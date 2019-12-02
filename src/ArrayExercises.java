
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
//        Person[] people = new Person[3];
//        people[0] = person1;
//        people[1] = person2;
//        people[2] = person3;

        Person[] people = new Person[]{person1, person2, person3};

        // Iteration through array of persons to print names

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        for (Person person : people) {
            System.out.println(person.relationship);
        }

        //    add a person method
//        public static Array addPerson() {
//
//        }

    }
}

