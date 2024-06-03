import java.util.Scanner;

class Second{
    public int scdSml(int arr[], int n){
        if(n<2) return -1;
        int small=Integer.MAX_VALUE;
        int scndSmall=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<small){
                scndSmall=small;
                small=arr[i];
            }
            else if(arr[i]<scndSmall && arr[i]!=small){
                scndSmall=arr[i];
            }

        }
        return scndSmall;
    }

    public int scdLargest(int arr[], int n){
        if(n<2) return -1;
        int scndLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                scndLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>scndLargest && arr[i]!=largest){
                scndLargest=arr[i];
            }
        }
        return scndLargest;
    }
}

public class ScndSmallestAndLargest {
    public static void main(String[] args) {
        int[] arr={12,11,3,4,2};
        int n=arr.length;
        Second s=new Second();
        int sL=s.scdLargest(arr, n);
        int sS=s.scdSml(arr, n);
        System.out.println("Second Largest Element from the array = "+sL);
        System.out.println("Second Smallest Element from the array = "+sS);

    }
}
