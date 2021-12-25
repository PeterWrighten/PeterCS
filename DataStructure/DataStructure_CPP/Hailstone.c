#include<stdio.h>




int main(){
    void ha(int n);
    int n;
    printf("input a number: ");
   scanf("%d",&n);
   ha(n);
   return 0;
}

void ha(int n){
    int num = 0;
    while(n != 1){
    printf("%d\n",n);
    ++num;

        if(n%2 == 0){
            n = n/2;
        }else{
            n = 3 * n + 1;
        }
    }
    if(n == 1){
        printf("%d\n",n);
        ++num;
    }
    printf("num:%d\n",num);
}
