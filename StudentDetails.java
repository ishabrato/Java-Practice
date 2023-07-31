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
