//W.A.P. to read n numbers in an array and remove the duplicates from an array.?

import java.util.Scanner;

public class DuplicateNumberRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        removeDuplicates(arr, n);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void removeDuplicates(int arr[], int n) {
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                temp[j] = arr[i];
                j++;

            }
        }
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
    }

}
