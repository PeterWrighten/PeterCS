#include<stdio.h>
#include<math.h>
int rn(int x){
    int A = 48109; int B = 2531011; int M = 32768;
    return (A*x + B)%M;
}
int rn(int x);
int main(){
  int a;
  int b;
  int i;
  begin:
  printf("積分区間の下限値aを入力してください＞");
  scanf("%d",&a);
  printf("積分区間の上限値bを入力してください＞");
  scanf("%d",&b);
  printf("乱数を発生する回数を入力してください（1000万回以下）＞");
  scanf("%d",&i);

  if(i <= 10000000){
  int x=1;
  double y;
  int k;
  int j;

  double X;
  double Y;
    X = (double) x;
    Y = (double) y;
  for(j = 1; j <= i; j++){
  x = rn(x);
  y = (double)(x%1001) *0.001;
  X = (b - a) * y + a;
  Y = b*b * y;



if( X*X < Y ){

        k++;
}

  }

  double p = (double)k/i * (b - a) * (b*b);
  double t = (double)1/3 * (b*b*b - a*a*a);
  double r = fabs((double)(p - t));
  printf("　-　-　-計算結果-　−　−　\n");
  printf("積分値（理論値）＝ %2.4f\n",t );
  printf("積分値（シミュレーション値）＝ %2.4f\n",p);
  printf("積分値の誤差　＝ %2.4f\n",r);



  return 0;
}else{
    printf("エラー！！1000万回以上となります！やり直してください！\n");
    goto begin;
}


}
