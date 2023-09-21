interface Bird_log{
    void fly();
    void sing();
}
class Sparrow implements Bird_log{
    public void fly(){
        System.out.println("Flying...");
    }
    public void sing(){
        System.out.println("Kichirmichir");
    }
}
class Penguin implements Bird_log{
    public void fly(){
        System.out.println("Penguin can't fly");
    }
    public void sing(){
        System.out.println("Aaaaaaaaaaa");
    }
}
class Bird{
    public static void main(String[] args){
        Sparrow s1=new Sparrow();
        Penguin p1=new Penguin();
        s1.fly();
        s1.sing();
        p1.fly();
        p1.sing();
    }
}