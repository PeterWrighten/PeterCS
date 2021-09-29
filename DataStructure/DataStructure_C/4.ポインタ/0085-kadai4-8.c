#include<stdio.h>
void pinc(int *x, int d){
    *x = *x + d;
}

int main(){
   int d;
   int a;

   int x;
   int b;

   printf("お好きなxを入力してください。\n");
   scanf("%d",&x);
     b = x;
   printf("増やしたいdを入力してください。\n");
   scanf("%d",&d);
     a = d;
   pinc(&x, d);
   printf("%dを%dだけを増やすのは、%dである。",b,a,x);
   return 0;

}
