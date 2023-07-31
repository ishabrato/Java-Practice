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