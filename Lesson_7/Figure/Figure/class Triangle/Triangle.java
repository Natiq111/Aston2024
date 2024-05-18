public class Triangle extends Figure implements CalcParametrs
{
    int sideA;
    int sideB;
    int sideC;
    int footing;
    int height;
    public Triangle(String name, String colorFill, String colorBorder, int sideA, int sideB, int sideC, int footing, int height)
    {
        super(name, colorFill, colorBorder);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.footing = footing;
        this.height = height;
    }
    public double squareFigure()
    {
        return (sideA + sideB + sideC);
    }
    
    public double perimeterFigure()
    {
        return (footing* height) / 2;
    }
     
}