
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i = ; i < n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Entered number is not prime.");
        } else {
            System.out.println("Entered number is prime.");
        }
    }
}
