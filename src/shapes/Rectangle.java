package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    @Override
    public double getArea() {
        return (length * width);
    }


//    ------------inheritance and poly exercise-------------------

////    properties
//    protected double length;
//    protected double width;
//
////    constructor
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
////    methods
//    public double getArea () {
//        return (length * width);
//    }
//
//    public double getPerimeter() {
//        return ((2 * length) + (2 * width));
//    }



}
