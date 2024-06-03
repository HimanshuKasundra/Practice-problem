#include<stdio.h>
void main(){
    int a[100],i,j,n,temp;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("Enter %d element : ",(i+1));
        scanf("%d",&a[i]);
    }
    for(i=0;i<n-1
    ;i++){
        for(j=0;j<n-i;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    for(i=0;i<n;i++){
        printf("%d ,",a[i]);
    }
}