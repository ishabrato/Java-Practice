import java.util.*;
interface Bank{
    void deposit();
    void withdraw();
    void display();
}
class SavingsAcc implements Bank{
    Scanner sc=new Scanner(System.in);
    double CurrentBal=0.00;
    double amount=0.00;
    public void deposit(){
        System.out.println("Enter the amount to be deposited");
        amount=sc.nextDouble();
        CurrentBal=CurrentBal+amount;
        System.out.println("Amount deposited: "+amount);
        System.out.println("Current Balance: "+CurrentBal);
    }
    public void withdraw(){
        System.out.println("Enter the amount to be withdrawn");
        amount=sc.nextDouble();
        CurrentBal=CurrentBal-amount;
        System.out.println("Amount withdrawn: "+amount);
        System.out.println("Current Balance: "+CurrentBal);
    }
    public void display(){
        System.out.println("Current Balance: "+CurrentBal);
    }
}

class CheckingAcc implements Bank{
    Scanner sc=new Scanner(System.in);
    double CurrentBal=0.00;
    double amount=0.00;
    public void deposit(){
        System.out.println("Enter the amount to be deposited");
        amount=sc.nextDouble();
        CurrentBal=CurrentBal+amount;
        System.out.println("Amount deposited: "+amount);
        System.out.println("Current Balance: "+CurrentBal);
    }
    public void withdraw(){
        System.out.println("Enter the amount to be withdrawn");
        amount=sc.nextDouble();
        CurrentBal=CurrentBal-amount;
        System.out.println("Amount withdrawn: "+amount);
        System.out.println("Current Balance: "+CurrentBal);
    }
    public void display(){
        System.out.println("\nCurrent Balance: "+CurrentBal);
    }
    
}
class BankMain {
    public static void main(String[] args) {
        SavingsAcc s1 = new SavingsAcc();
        CheckingAcc c1 = new CheckingAcc();
        Scanner sc = new Scanner(System.in);
        double amount;
        while(true){
            System.out.println("\nWelcome to Banking system");
            System.out.println("Choose"+"\n (1) for saving account"+"\n (2) for checking account");
            int inputAcc = sc.nextInt();
            switch (inputAcc) {
                case 1: System.out.println("Welcome to saving account");
                        System.out.println("Choose"+"\n (1) for deposit"+"\n (2) for withdrawn"+"\n (3) for check balance"+"\n (0) for exit");
                        int inputCh = sc.nextInt();
                        switch (inputCh) {
                            case 1: s1.deposit();
                                break;
                            case 2: s1.withdraw();
                                break;
                            case 3: s1.display();
                                break;        
                            case 0: System.exit(0);
                            default:
                                break;
                        }
                    
                    break;
                case 2: System.out.println("Welcome to checking account");
                        System.out.println("Choose"+"\n (1) for deposit"+"\n (2) for withdrawn"+"\n (3) for check balance"+"\n (0) for exit");
                        int inputCh2 = sc.nextInt();
                        switch (inputCh2) {
                            case 1: c1.deposit();
                                break;
                            case 2: c1.withdraw();
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

    

