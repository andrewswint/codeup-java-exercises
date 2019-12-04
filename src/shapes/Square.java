package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
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
        return (4 * super.length);
    }

    @Override
    public double getArea() {
        return Math.pow(super.length,2);
    }


    //    ------------inheritance and poly exercise-------------------

//    //    constructor
//    public Square (double side) {
//        super(side, side);
//    }
//
////    methods
//    @Override
//    public double getArea () {
//        return Math.pow(super.length,2);
//    }
//
//    @Override
//    public double getPerimeter () {
//        return (4 * super.length);
//    }

}
