import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n b/w 0 - 99");
        int n = sc.nextInt();
        int temp = n;
        int ten = n/10;
        int unit = n%10;

        if(n<0 || n>99)
            System.out.println("number is out of range");
        if(n>=11 && n <=19)
        {
            if(n==11) System.out.println("eleven"); 
            if(n==12) System.out.println("twelve");
            if(n==13) System.out.println("thirteen"); 
            if(n==14) System.out.println("fourteen");
            if(n==15) System.out.println("fifteen");
            if(n==16) System.out.println("sixteen");
            if(n==17) System.out.println("seventeen");
            if(n==18) System.out.println("eighteen");
            if(n==19) System.out.println("ninteen");
        }
        else{
            if(ten>=1 && ten<=9)    
            {   
                if(ten==1) System.out.print("ten");
                if(ten==2) System.out.print("twenty");
                if(ten==3) System.out.print("thirty");
                if(ten==4) System.out.print("fourty");
                if(ten==5) System.out.print("fifty");
                if(ten==6) System.out.print("sixty");
                if(ten==7) System.out.print("seventy");
                if(ten==8) System.out.print("eighty");
                if(ten==9) System.out.print("ninty");
            }
            if(unit>=1 && unit <=9)
            {
                if(unit==1) System.out.println(" one");
                if(unit==2) System.out.println(" two");
                if(unit==3) System.out.println(" three");
                if(unit==4) System.out.println(" four");
                if(unit==5) System.out.println(" five");
                if(unit==6) System.out.println(" six");
                if(unit==7) System.out.println(" seven");
                if(unit==8) System.out.println(" eight");
                if(unit==9) System.out.println(" nine");
            }
        }
    }   

}
