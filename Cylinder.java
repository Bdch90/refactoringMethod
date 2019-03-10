

public class Cylinder
{
    public double getVolume(double radius, double height)
    {
        double area = getArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * area;
        return volume;
    }
    private double getArea(double radius)
    {
        return Math.PI * radius * radius;
    }
    private double getPerimeter(double radius)
    {
        return 2 * Math.PI  * radius;
    }
}