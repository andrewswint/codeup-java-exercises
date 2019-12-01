package OOP_Practice;

import java.util.Scanner;

public class Objects_Main {

    public static void main (String[] args) {
        Objects cup = new Objects();
        System.out.println(cup.cupColor);
        System.out.println(cup.cupType);
        System.out.println(cup.cupFull);
        cup.fill();
        System.out.println(cup.cupFull);

        Objects lights = new Objects();
        Scanner sc = new Scanner(System.in);
        System.out.println(lights.christmasLightsColor);
        System.out.println("the lights are lit? " + lights.lightsLit);
        System.out.println("plug the lights in [y/n]");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("y")) {
            lights.plugin();
        } else {
            lights.unplug();
        }
        System.out.println("the lights are lit? " + lights.lightsLit);

    }

}
