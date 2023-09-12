class ShapeCalculator {
    void cal(int x, int y){
        System.out.println("Area of a Rectangle:"+(x*y));
    }
    void cal(int r){
        System.out.println("Area of a Circle:"+(3.14*r*r));
    }
    void cal(int a, int b, int c){
        if((a+b)>c && (a+c)>b && (b+c)>a)
          {
            int s=(a+b+c)/2;
            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
             System.out.println("Area of Triangle is: " + area);    
           }
         else  
           System.out.println("Area of Triangle not exit");
    }
    public static void main(String[] args) {
        ShapeCalculator c = new ShapeCalculator();
        c.cal(10,20);
        c.cal(10);
        c.cal(10,10,10);
    }
}
