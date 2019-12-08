public class Person {

    public String relationship;
    private String name;

// constructor
    public Person(String firstName) {
        this.name = firstName;
    }



    public String getName(){
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }


//
//    public void sayHello () {
//        System.out.println(this.name + " says hello!");
//    }

//    public static void main(String[] args) {
//        Person person = new Person("Andrew");
//        person.sayHello();
//        person.setName("Jacob");
//        System.out.println(person.name);
//        System.out.println(person.getName());
//        System.out.println(person.name);
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1.getName() == person2.getName());
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//    }



}
