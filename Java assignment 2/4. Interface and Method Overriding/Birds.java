interface Bird {
    void fly();
    void sing();
}

class Sparrow implements Bird {

    public void fly() {
        System.out.println("The sparrow flies.");
    }

    public void sing() {
        System.out.println("The sparrow sings.");
    }
}

class Penguin implements Bird {

    public void fly() {
        System.out.println("The penguin cannot fly.");
    }

    public void sing() {
        System.out.println("The penguin cannot sing.");
    }
}

class Birds {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();
        sparrow.fly();
        sparrow.sing();
        penguin.fly();
        penguin.sing();
    }
   


}
