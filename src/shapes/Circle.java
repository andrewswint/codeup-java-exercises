package shapes;

import util.Input;

public class Circle {
    private static double radius;
// constructor

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }
    public double getCircumference() {
        double circumference = (2 * Math.PI * radius);
        return circumference;
    }

}
