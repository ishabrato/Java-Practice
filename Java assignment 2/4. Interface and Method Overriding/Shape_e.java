interface Shape {
 void calArea();
}
class Circle implements Shape {
    int r=8;
    public void calArea() {
        System.out.println("Area of circle: "+(3.14*r*r));
    }
}
class Rectangle implements Shape {
 int n=9, i=5;
 public void calArea() {
     System.out.println("Area of rectangle: "+(n*i));
 }
}
class Shape_e{
    public static void main(String[] args) {
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.calArea();
        r.calArea();
    }
}