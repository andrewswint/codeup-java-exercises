public class Person {
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

    public void sayHello () {
        System.out.println(this.name + " says hello!");
    }

    public static void main(String[] args) {
        Person person = new Person("Andrew");
        person.sayHello();
        person.setName("Jacob");
        System.out.println(person.name);
        System.out.println(person.getName());
        System.out.println(person.name);
    }



}
