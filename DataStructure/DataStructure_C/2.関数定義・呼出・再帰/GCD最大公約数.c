

#include<stdio.h>
int main(){
    int x,y;
    printf("最大公約数を求める2つの自然数x、yを入力してください。\n");
    printf("x=");
    scanf("%d",& x);
    printf("y=");
    scanf("%d",& y);
    printf("x、yの最大公約数は%dである。",gcd(x,y));

    return 0;

}


int gcd(int x, int y){
    int a;
    int b;
    if(x > y){
        a = x;
        b = y;
    }else{
        a = y;
        b = x;
    }
    if(a % b == 0){
        return  b;
    }else{
        return  gcd(a, a%b);
    }
}
