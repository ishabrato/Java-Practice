import java.util.*;

interface Converter {
    void convertCurrency();
}

class EuroConverter implements Converter {
    Scanner sc = new Scanner(System.in);
    double amt = 0;

    public void convertCurrency() {
        System.out.print("\nEnter the amount to be converted: ");
        amt = sc.nextDouble();
        System.out.println("INR to Euro currency convertor: " + (amt * 88.501));
    }
}

class DollarConverter implements Converter {
    Scanner sc = new Scanner(System.in);
    double amt = 0;

    public void convertCurrency() {
        System.out.print("\nEnter the amount to be converted:");
        amt = sc.nextDouble();
        System.out.println("INR to USD currency convertor: " + (amt * 83.10));
    }
}

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DollarConverter d = new DollarConverter();
        EuroConverter e = new EuroConverter();
        while (true) {
            System.out.println("\nCurrency converters");
            System.out.println("Choose\n (1) For INR To USD Converter\n (2) For INR To Euro Converter\n (3) For Exit");
            System.out.print("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    d.convertCurrency();
                    break;
                case 2:
                    e.convertCurrency();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }

        }
    }
}
