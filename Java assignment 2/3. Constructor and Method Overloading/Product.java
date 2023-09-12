class Product {
    String pName,pId;
    double price;
    int quantity;
    Product(){
        this.pName="Something";
        this.pId="So64e5hing";
        this.price=60.00;
        this.quantity=5;
    }
    Product(String pName, String pId, double price, int quantity){
        this.pName=pName;
        this.pId=pId;
        this.price=price;
        this.quantity=quantity;
    }

    void display(int x){
        System.out.println("Cost: " + (price*quantity));
    }
    void display(double y){
        System.out.println("Cost: " + (price*quantity));
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Something2","wqew554",90.00,4);
        p1.display(4);
        p2.display(5.00);

    }
}
