public class SumofElement {
    public static void main(String[] args) {
        int arr[]={11,12,13,1,3};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
             sum=sum+arr[i];
        }
        System.out.println("Average of Elements = "+sum/arr.length);
    }
}
