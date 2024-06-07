import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter number of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                sumEven += arr[j];
            } else {
                sumOdd += arr[j];
            }

        }
        System.out.println("Sum of Even:" + sumEven);
        System.out.println("Sum of Odd:" + sumOdd);
    }
}
