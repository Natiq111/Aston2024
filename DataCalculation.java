
        
public class DataCalculation
{
     
     public static void main(String[] args)
     {
        
        Circle circle1 = new Circle("Первый круг", "белый", "зеленый", 10);
        double square1 = circle1.squareFigure();
        double perimeter1 = circle1.perimeterFigure();
        circle1.color();
        System.out.println(circle1.name + ":" + "\nплощадь = " +  square1 + "\nпериметр = " +
        perimeter1 + "\nцвет заливки - " + circle1.colorFill + "\nцвет границы - " + circle1.colorBorder);
        
        System.out.println();
         
        Rectangle rectangle1 = new Rectangle("Первый прямоугольник", "желтый", "серый", 2, 8);
        double square2 = rectangle1.squareFigure();
        double perimeter2 = rectangle1.perimeterFigure();
        rectangle1.color();
        System.out.println(rectangle1.name + ":" + "\nплощадь = " +  square2 + "\nпериметр = " +  
        perimeter2 + "\nцвет заливки - " + rectangle1.colorFill + "\nцвет границы - " + rectangle1.colorBorder);
        
        System.out.println();
        
        Triangle triangle1 = new Triangle("Первый треугольник", "красный", "черный", 5, 4, 8, 7, 9);
        double square3 = triangle1.squareFigure();
        double perimeter3 = triangle1.perimeterFigure();
        triangle1.color();
        System.out.println(triangle1.name + ":" + "\nплощадь = " +  square3 + "\nпериметр = " +
        perimeter3 + "\nцвет заливки - " + triangle1.colorFill + "\nцвет границы - " + triangle1.colorBorder);
        
         
    }
    
}