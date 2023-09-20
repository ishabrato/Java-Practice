class Book {
   String title, author; 
   int isbn; 
   float price;
   Book(){
    this.title = "HTML";
    this.author = "Akash";
    this.isbn = 363458589;
    this.price = 90.23f;
   }
   Book(String title, String author, int isbn, float price){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
   }
   Book(String author, String title, float price, int isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
   }
   void display(){
    System.out.println("Book name:"+ this.title);
    System.out.println("Book author:"+ this.author);
    System.out.println("Book ISBN:"+ this.isbn);
    System.out.println("Book price:"+ this.price);
   }
   public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("JAVA", "Rahul", 123456789, 99.00f);
        Book b3 = new Book("Sagnik", "C Lang", 53.00f, 987654321);
        b1.display();
        b2.display();
        b3.display();
    }
}
