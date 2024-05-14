import java.lang.Math;

public class Circle extends Figure implements CalcParametrs
{
    int radius;
    public Circle(String name, String colorFill, String colorBorder, int radius)
    {
        super(name, colorFill, colorBorder);
        this.radius = radius;
    }
    
    public double squareFigure()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double perimeterFigure() 
    {
        return Math.PI * (2 * radius);
    }
}