interface Language{
    void greet();
}
class English implements Language{
    public void greet(){
        System.out.println("Hello");
    }
}
class French implements Language{
    public void greet(){
        System.out.println("Bonjour");
    }
}
class Spanish implements Language{
    public void greet(){
        System.out.println("Hola");
    }
}
class Greet {
    public static void main(String[] args) {
         English e = new English();
         French f = new French();
         Spanish s = new Spanish();
        e.greet();
        f.greet();
        s.greet();
    }
}
