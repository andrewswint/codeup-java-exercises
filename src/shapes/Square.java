package shapes;

public class Square extends Rectangle{

    //    constructor
    public Square (double side) {
        super(side, side);
    }

//    methods
    @Override
    public double getArea () {
        return Math.pow(super.length,2);
    }

    @Override
    public double getPerimeter () {
        return (4 * super.length);
    }

}
