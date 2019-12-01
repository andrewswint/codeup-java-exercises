package OOP_Practice;

public class Objects {

     String cupType = "mug";
     String cupColor = "black";
     static boolean cupFull = false;
     public static void fill() {
        cupFull = true;
    }
    public static void empty() {
         cupFull = false;
    }

    String christmasLightsColor = "multi colored";
    static boolean lightsLit = false;
    public static void plugin() {
        lightsLit = true;
    }
    public static void unplug() {
      lightsLit = false;
    };

}
