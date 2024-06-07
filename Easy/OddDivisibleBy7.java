import java.util.Scanner;

public class OddDivisibleBy7 {
    public static void main(String[] args) {
        int n1 = 150;
        int n2 = 445;
        for (int i = 150; i <= n2; i++) {
            if (i % 2 != 0 && i % 7 == 0 && i % 3 != 0) {
                System.out.println(i + ",");
            }
        }
    }
}
