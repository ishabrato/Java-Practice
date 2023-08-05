
# Java Practice

This is just a lame repo to practice my JAVA 😀


### ⦁ Create a class called Shape with a method calculateArea() that returns 0. Then, create two subclasses called Rectangle and Circle, which inherit from Shape. Implement the calculateArea() method in both subclasses to return the area of the respective shapes.

```java
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
```

### ⦁ Create a class called Animal with an attribute name and a method makeSound() that prints a generic sound. Then, create two subclasses called Dog and Cat, which inherit from Animal. Override the makeSound() method in both subclasses to print the respective sounds of a dog and a cat.

```java
import java.util.*;
class AnimalDetail {
    String name;
    void name(String name){
        this.name = name;
    }
    void makeSound(){
        System.out.println("The animal makes sound.");
    }
}
class Dog extends AnimalDetail{
     void makeSound(){
        System.out.println("Barkes");
     }
}
class Cat extends AnimalDetail{
    void makeSound(){
        System.out.println("Meowes");
     
}
}
class Animal{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the dog: ");
        String name = sc.nextLine();
        dog.name(name);
        dog.makeSound();
        System.out.print("Enter the name of the cat: ");
        String nameCat = sc.nextLine();
        cat.name(nameCat);
        cat.makeSound();

    }
}
```

### ⦁ Create a class called Person with attributes name and age, and a method displayInfo() that prints the name and age of the person. Then, create a subclass called Student that inherits from Person and adds an attribute studentId. Override the displayInfo() method in the Student class to include the student ID in the output.

```java
import java.util.Scanner;

class Person{
    String name;
    int age;
    void name(String name){
        this.name = name;
    }
    void age(int age){
        this.age = age;
    }
    void displayInfo(){
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+ age);
    }
}
class Student extends Person{
    int sid;
    void id(int sid){
        this.sid = sid;
    }
    void displayInfo(){
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+ age);
        System.out.println("ID is: "+ sid);
    }
}
class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        System.out.print("Enter student id: ");
        int sid = sc.nextInt();
        s1.name(name);
        s1.age(age);
        s1.id(sid);
    }
}
```
### ⦁ Create a class called BankAccount with attributes accountNumber and balance, and methods deposit(double amount) and withdraw(double amount) to add and subtract money from the balance, respectively. Then, create two subclasses called SavingsAccount and CheckingAccount, which inherit from BankAccount. In the SavingsAccount class, override the withdraw() method to ensure a minimum balance of $100 is maintained, and in the CheckingAccount class, override the withdraw() method to allow overdraft up to -$100.

```java
import java.util.*;

class BankAccount {
    int acc;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }
    void display(){
        System.out.println("Balance is: "+ balance);
    }
}

class Savingsacc extends BankAccount {
    void withdraw(double amount) {
        if (balance <= 100) {
            System.out.println("cant withdraw");
        } else {
            balance = balance - amount;
        }
    }
}

class Cheakingacc extends BankAccount {
    void withdraw(double amount) {
        if (balance > 0) {
            balance = balance - amount;
        } else if(balance==0 && amount<=100) {
            balance = balance - amount;
        } else {
            System.out.println("cant withdraw");
        }
    }

}


class Bank {
    public static void main(String[] args) {
        Savingsacc s1 = new Savingsacc();
        Cheakingacc c1 = new Cheakingacc();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\nWelcome to banking system");
            System.out.println("Choose"+"\n (1) for saving account"+"\n (2) to for cheaking account");
            int inputAcc = sc.nextInt();
            switch (inputAcc) {
                case 1: System.out.println("Welcome to saving account");
                        System.out.println("Choose"+"\n (1) for deposite"+"\n (2) to for withdrawl"+"\n (3) to for check balance"+"\n (0) to for exit");
                        int inputCh = sc.nextInt();
                        switch (inputCh) {
                            case 1: System.out.print("Enter the amount to deposit: ");
                                    int amount = sc.nextInt();
                                    s1.deposit(amount);
                                break;
                            case 2: System.out.print("Enter the amount to withdraw: ");
                                    int amount2 = sc.nextInt();
                                    s1.withdraw(amount2);
                                break;    
                            case 3: s1.display();
                                break;
                            case 0: System.exit(0);
                            default:
                                break;
                        }
                    
                    break;
                case 2: System.out.println("Welcome to cheaking account");
                        System.out.println("Choose"+"\n (1) for deposite"+"\n (2) to for withdrawl"+"\n (3) to for check balance"+"\n (0) to for exit");
                        int inputCh2 = sc.nextInt();
                        switch (inputCh2) {
                            case 1: System.out.print("Enter the amount to deposit: ");
                                    int amount = sc.nextInt();
                                    c1.deposit(amount);
                                break;
                            case 2: System.out.print("Enter the amount to withdraw: ");
                                    int amount2 = sc.nextInt();
                                    c1.withdraw(amount2);
                                break;    
                            case 3: c1.display();
                                break;
                            case 0: System.exit(0);
                            default:
                                break;
                        }
                    
                    break;    
            
                default:
                    break;
            }

        }
    }
}
```
