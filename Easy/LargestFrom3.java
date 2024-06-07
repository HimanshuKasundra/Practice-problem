import java.util.Scanner;

public class LargestFrom3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter a NUmber2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter a NUmber3: ");
        int n3 = sc.nextInt();
        int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println("Largest number:" + max);

    }
}