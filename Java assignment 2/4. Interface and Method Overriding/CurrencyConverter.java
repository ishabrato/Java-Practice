import java.util.*;

interface Converter {
    void convertCurrency();
}

class EuroConverter implements Converter {
    Scanner sc = new Scanner(System.in);
    double amt = 0;

    public void convertCurrency() {
        System.out.println("\n---------------INR TO EURO CONVERTOR---------------");
        System.out.print("Enter the amount to be converted: ");
        amt = sc.nextDouble();
        System.out.println("INR to Euro currency convertor: " + (amt * 88.50));
        System.out.println("----------------------------------------------------");
    }
}

class DollarConverter implements Converter {
    Scanner sc = new Scanner(System.in);
    double amt = 0;

    public void convertCurrency() {
        System.out.println("\n---------------INR TO USD CONVERTOR---------------");
        System.out.print("Enter the amount to be converted:");
        amt = sc.nextDouble();
        System.out.println("INR to USD currency convertor: " + (amt * 83.10));
        System.out.println("----------------------------------------------------");
    }
}

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DollarConverter dollar = new DollarConverter();
        EuroConverter euro = new EuroConverter();
        while (true) {
            System.out.println("\n Welcome Too Currency Converter");
            System.out.println("------------Select------------\n (1) For INR To USD Converter\n (2) For INR To Euro Converter\n (3) For Exit");
            System.out.print("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    dollar.convertCurrency();
                    break;
                case 2:
                    euro.convertCurrency();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
                    System.out.println("----------------------------------------------------");
            }

        }
    }
}
