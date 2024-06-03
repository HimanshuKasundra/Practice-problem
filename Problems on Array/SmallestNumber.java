import java.util.Scanner;

public class SmallestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a element: ");
            arr[i]=sc.nextInt();
        }
        int s_digit=1000;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<s_digit){
                s_digit=arr[i];
            }
        }
        System.out.println("Smallest Element:"+s_digit);
    }
}