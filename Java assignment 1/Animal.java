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
