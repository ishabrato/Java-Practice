interface AnimalSound {
    void makeSound();
}
class Dog implements AnimalSound{
   public void makeSound(){
        System.out.println("Woof");
    }
}
class Cat implements AnimalSound{
    public void makeSound(){
        System.out.println("Meow");
    }
}
class Animal{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}