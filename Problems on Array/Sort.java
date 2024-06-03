import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr={12,23,31,1,222,21,11,5,7,3};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("Increasing order");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("\nDecreasing order");
        for (int i = n-1; i >=0; i--) {
            System.out.print(arr[i]+",");
        }
    }
}
