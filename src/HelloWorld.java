public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 3;
        String myString = "My favorite number";
        System.out.println(myFavoriteNumber);
        System.out.println(myString);
        float myNumber = 3.14f;

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;

        int three = (int) "three";

        int x = 4;
        x+=5;

        int x = 3;
        int y = 4;
        y+=x;

          int x = 10;
          int y = 2;
          y-=x;
          x/=y;


        System.out.println(y);
        byte number = 127+2;
    }
}
