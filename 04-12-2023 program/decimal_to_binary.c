#include<stdio.h>
void main()
{
    int n,arr[100],temp,rem,i=0,count=0;
    printf("Enter a number: ");
    scanf("%d",&n);
    temp=n;
    while(n!=0){
        rem=n%2;
        arr[i]=rem;
        n=n/2;
        i++;
    }
    for(int j=i-1;j>=0;j--){
        printf("%d",arr[j]);
    }
}
