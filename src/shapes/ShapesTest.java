package shapes;

import javax.xml.stream.util.XMLEventAllocator;

public class ShapesTest {

    public static void main (String[] args) {

        Measurable myShape;

        myShape = new Square(2);
        System.out.println("Square");
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(4,5);
        System.out.println("Rectangle");
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


//    ------------inheritance and poly exercise-------------------
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }

}
