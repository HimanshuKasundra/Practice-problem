import java.util.Scanner;

public class HarshadNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            int lst=n%10;
            sum=sum+lst;
            n=n/10;
        }
        if(temp%sum==0){
            System.out.println("Number is Harshad Number");
        }else{
            System.out.println("Number is not Harshad number");
        }
    }
}