package shapes;

public class Square extends Rectangle{

    //    properties
    protected static int side;

    //    constructor
    public Square (int side) {
        super(side, side);
        this.side = side;
    }

//    methods
    @Override
    public int getArea () {
        return (int) Math.pow(side,2);
    }

    @Override
    public int getPerimeter () {
        return (4 * side);
    }

}
