#include <stdio.h>

int main(){
    int x;

    printf("階乗を求める自然数を入力してください\n");
    scanf("%d",&x);
    if(x >= 1 && x<= 10){
        printf("結果は%d! = %dです.\n",x,f(x));
    }else{
        return 0;
    }
}

int f(int x){

    if(x==0)return 1;
    else return  x * f(x - 1);
    }
