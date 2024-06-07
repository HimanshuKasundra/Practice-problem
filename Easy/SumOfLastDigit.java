
//  Accept two integers from the user and calculate the sum of last digits of both the integers. For
// example, if the numbers are 27 and 459, then the sum of last digits would be 16 (i.e. 7 + 9).
import java.util.*;

public class SumOfLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = scanner.nextInt();
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int add = lastDigit1 + lastDigit2;
        System.out.println("Sum of last digits:" + add);

    }
}
