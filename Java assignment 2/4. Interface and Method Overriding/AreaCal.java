import java.util.*;
interface Shape{
   void calculatePerimeter();
   void calculateArea();
}
class Circle implements Shape{
    Scanner sc=new Scanner(System.in);
    double radius;
    public void calculatePerimeter(){
        System.out.println("Enter the radius of the circle");
        radius=sc.nextDouble();
    }
    public void calculateArea(){
        calculatePerimeter();
        System.out.println("The area of the circle is "+(3.14*radius*radius));
    }
}
class Rectangle implements Shape{
    Scanner sc=new Scanner(System.in);
    double width, hight;
    public void calculatePerimeter(){
        System.out.println("Enter the width of the rectangle");
        width=sc.nextDouble();
        System.out.println("Enter the height of the rectangle");
        hight=sc.nextDouble();
    }
    public void calculateArea(){
        calculatePerimeter();
        System.out.println("The area of the rectangle is "+(width*hight));
    }
}
class AreaCal {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.calculateArea();
        r.calculateArea();
    }
}
