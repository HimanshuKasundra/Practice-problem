#include<stdio.h>
void main()
{
    int count=1;
    for(int i=0; i<=4;i++){
        for(int j=0;j<=4;j++){
            if(i%2==0){
                printf("%d ",count);
                count++;
            }
            else{
                printf("%d ",count-1);
                count--;
            }
       
        }
         printf("\n");
        count=count+5;
    }
}
