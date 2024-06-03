import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a element" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int l_digit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l_digit) {
                l_digit = arr[i];
            }
        }
        System.out.println("Largest Element:" + l_digit);
    }

}
