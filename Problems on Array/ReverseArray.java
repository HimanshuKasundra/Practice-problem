class Array{
    public void printArray(int[] arr,int n){
        System.out.println("\nArray : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
    public void reverse(int[] arr, int n){
        int ans[]=new int[5];
        for (int i = n-1; i>=0; i--) {
            ans[n-i-1]=arr[i];
        }
        printArray(ans, n);
    }
}

public class ReverseArray {
    public static void main(String [] args){
        int[]  arr={1,2,4,3,6};
        int n=arr.length;
        Array a=new Array();
        System.out.print("Before reverse:");
        a.printArray(arr,n);
        System.out.print("\nAfter reverse:");
        a.reverse(arr, n);        
    }
}
