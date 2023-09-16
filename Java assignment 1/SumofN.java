import java.util.*;
class SumofN {
    int sum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        SumofN obj = new SumofN();
        System.out.println("Sum of "+n+": "+obj.sum(n));
    }
}
