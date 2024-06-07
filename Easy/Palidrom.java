import java.util.Scanner;

public class Palidrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int last = n % 10;
            n = n / 10;
            rev = rev * 10 + last;
        }
        if (temp == rev) {
            System.out.println("Enter number is palidrom");
        } else {
            System.out.println("Enter number is not palidrom");
        }
    }
}
