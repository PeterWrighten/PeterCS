#include<stdio.h>
int main(){
    int i,j;
    for(i=9;i>=1;i=i-2){
        for(j=1;j<=9;j=j+2){
            printf("%d + %d = %d\n",i,j,i+j);
        }
            printf("-----------------------------\n");
    }
            return 0;

}
