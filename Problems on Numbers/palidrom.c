#include<stdio.h>
void main()
{
    int n,temp,rem,rev=0;
    printf("Enter a number: ");
    scanf("%d",&n);
    temp=n;
    while(n!=0){
        rem=n%10;
        rev=rem+(rev*10);
        n=n/10;
    }
    if(temp==rev){
        printf("number is palidrom");
    }
    else{
        printf("number is not palidrom");
    }
}
