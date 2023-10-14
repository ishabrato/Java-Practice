//Problem 1: Bank Account Create a class representing a bank account with attributes like account number, account holder name, and balance. Implement methods to deposit and withdraw money from the account.
class Bank{
    private Double balance=0.00;
    private String acc_name  = "null";
    private int acc_number = 000000;

    Bank(int account_number, String acc_name, Double balance){
        this.balance = balance;
        this.acc_name = acc_name;
        this.acc_number = account_number;
    }
    void withdraw(int amount){
        balance -= amount;
       
    }
    void deposit(int amount){
        balance += amount;
       
    }
    void display(){
        System.out.println("-------------Details-------------");
        System.out.println("acc_name: " + acc_name);
        System.out.println("acc_number: " + acc_number);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------------");
    }
   public static void main(String[] args) {
        Bank b1 = new Bank(568745,"Isho", 100000.000);
        Bank b2 = new Bank(235678,"Raj", 100000.000);
        b1.withdraw(5000);
        b1.display();
        b2.deposit(4050);
        b2.display();
    
   }
}