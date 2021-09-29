#include<stdio.h>
int x = 77;
int y = 115;
int tmp;
int *p = &tmp;

int main(){
  printf("HENSU \t ADDRESS \t VALUE\n");
  printf("x \t %p \t %d\n",&x,x);
  printf("y \t %p \t %d\n",&y,y);
  *p = x;
  x = y;
  y = *p;
  printf("exchange x and y\n");
  printf("x \t %p \t %d\n",&x,x);
  printf("y \t %p \t %d\n",&y,y);
  return 0;



}
