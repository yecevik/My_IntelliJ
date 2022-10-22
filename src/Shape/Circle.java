package Shape;

public class Circle implements Shape{
    @Override
    public void calculateArea(double num,double pi,double r) {
        System.out.println("Circle Perimeter : "+(pi*(r*r)));

    }

    @Override
    public void calculatePerimeter(double num,double pi,double r)
    {System.out.println("Circle Perimeter : "+(2*pi*r));
    }
}
