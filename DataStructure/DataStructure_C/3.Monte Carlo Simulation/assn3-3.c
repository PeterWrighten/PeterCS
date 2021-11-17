#include<stdio.h>
int rn(int x){
    int A = 48109; int B = 2531011; int M = 32768;
    return (A*x + B)%M;
}
int rn(int x);
int main(){

    int i; int x = 1; int y; int z; int k;
    begin:
    printf("乱数を発生する回数を入力してください（1000万回以下）>");
    scanf("%d",&y);
if(y <= 10000000){
    int j[10];

    for(i = 1; i < 11; i++){
        j[i] = 0;
    }

    for(k = 0; k < y; k++){
        x = rn(x);
        z = x % 11;
        for(i = 1; i < 11; i++){
            if(z == i){
            j[i] = j[i] + 1;
            }
        }
    }

    for(i = 1; i <= 10; i++){
        double p = (double)j[i]/y ;
        int q = (int)(p * 20);

        printf("%2d: ",i);

        for(k = 1; k <= q; k++){
            printf("*");
        }
        for(k = 1; k <= 20 - q; k++){
            printf(" ");
        }

        printf("\t%d\n",j[i]);

    }
    printf("----------------------------------------------\n");

    printf("Total: \t\t\t\t%d\n",y);

    return 0;
}else{
    printf("エラー！！1000万回以上となります！やり直してください！\n");
    goto begin;
}
}
