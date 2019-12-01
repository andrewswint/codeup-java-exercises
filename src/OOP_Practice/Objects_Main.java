package OOP_Practice;

public class Objects_Main {

    public static void main (String[] args) {
        Objects cup = new Objects();
        System.out.println(cup.cupColor);
        System.out.println(cup.cupType);
        System.out.println(cup.cupFull);
        cup.fill();
        System.out.println(cup.cupFull);

    }

}
