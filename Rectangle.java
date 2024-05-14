public class Rectangle extends Figure implements CalcParametrs
{
    int length;
    int width;
    public Rectangle(String name,  String colorFill, String colorBorder, int length, int width)
    {
        super(name, colorFill, colorBorder);
        this.length = length;
        this.width = width;
    }
    
    public double squareFigure()
    {
        return length * width;
    }
    public double perimeterFigure()
    {
        return (length + width) * 2;
    }
}