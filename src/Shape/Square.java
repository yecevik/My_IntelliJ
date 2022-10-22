package Shape;

public class Square implements Shape{
    @Override
    public void calculateArea(double num,double pi,double r)
    {
        System.out.println("Square area: "+(num*num));
    }

    @Override
    public void calculatePerimeter(double num,double pi,double r)
    {
        System.out.println("Square Perimeter: "+(num*4));
    }
}
