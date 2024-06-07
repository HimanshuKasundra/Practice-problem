//1,3,6,10,...

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n number for series");
        int n = sc.nextInt();
        int num = 0;
        System.out.print("Series:" + num + ",");
        for (int i = 1; i < n + 2; i++) {
            num = num + i;
            System.out.print(num + ",");
        }
    }
}
