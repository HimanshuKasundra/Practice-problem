
// Create a program that would accept a string from the user and print a pattern. For example, if
// the user enters “Hello”, it should print a pattern as follows:
// H
// He
// Hel
// Hell
// Hello?
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
