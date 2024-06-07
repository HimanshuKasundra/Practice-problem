
// Accept three integer values from the user and display them in ascending order using only
// operators (i.e. without using if…else, switch case, or loop).?
import java.util.*;

public class Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.println("Enter third integer: ");
        int c = scanner.nextInt();
        printSorted(a, b, c);

    }

    static void printSorted(int a, int b, int c) {
        // maximum element
        int get_max = Math.max(a, Math.max(b, c));

        // minimum element
        int get_min = -Math.max(-a, Math.max(-b, -c));

        int get_mid = (a + b + c) - (get_max + get_min);

        System.out.print(get_min + " " + get_mid + " " + get_max);
    }
}
