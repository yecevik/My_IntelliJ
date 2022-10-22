package Shape;

public class ShapeTester {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.calculateArea(5,3.14,10);
        c.calculatePerimeter(5,3.14,10);
        Square s=new Square();
        s.calculateArea(5,3.14,10);
        s.calculatePerimeter(5,3.14,10);
    }
}
