import java.util.*;
class Shape {
    void calculateArea() {
    }
}
class Circle extends Shape {

    void calculateArea(double r) {
        System.out.println("Area of Circle: " + (3.14*r*r));
    }
}
class Rectangle extends Shape {
    void calculateArea(int h, int w) {
        System.out.println("Area of Rectangle: " + (h*w));
    }
}

class CalculateArea {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to area Calculator");
        System.out.println("Choose"+"\n (1) to calculate area of  circle"+"\n (2) to calculate area of  rectangle");
        int input = sc.nextInt();
        if(input == 1){
            System.out.print("Enter Radius of the circle: ");
            double r = sc.nextDouble();
            circle.calculateArea(r);
        }
        else if(input == 2){
            System.out.print("Enter Hight of the rectangle: ");
            int h = sc.nextInt();
            System.out.print("Enter Width of the rectangle: ");
            int w = sc.nextInt();
            rectangle.calculateArea(h,w);
        }
        else{
            System.out.println("Wrong Input");
        }

    }
}