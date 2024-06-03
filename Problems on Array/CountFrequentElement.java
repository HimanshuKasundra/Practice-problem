class FrequentElement{
    public void frequent(int arr[],int n){
        boolean visited[]=new boolean[8];

        for (int i = 0; i < arr.length; i++) {

            if(visited[i]==true){
                continue;
            }

            int count=1;


            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+"occurns in "+count+" times.");
        }
    }
}
public class CountFrequentElement {
    public static void main(String [] args){
        int arr[]={10,11,11,12,13,14,14,10};
        int n=arr.length;
        FrequentElement f=new FrequentElement();
        f.frequent(arr, n);
    }
}
