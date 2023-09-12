class Calculate {
    void cal(int a, int b){
        System.out.println(a + "+" + b + "="+(a+b));
    }
    void cal(double a, double b){
        System.out.println(a + "+" + b + "="+(a+b));
    }
    void cal(int a, double b){
        System.out.println(a + "+" + b + "="+(a+b));
    }
    public static void main(String[] args) {
        Calculate c = new Calculate();
        c.cal(1,2);
        c.cal(5.2,6.4);
        c.cal(2,3.00);
    }
}
