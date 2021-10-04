#include <stdio.h>
#include <math.h>

typedef struct point{
  int x;
  int y;
} POINT;

double distance(POINT p1){
    return sqrt(p1.x * p1.x + p1.y * p1.y);
}

int main(){
  POINT p1;
  double distance(POINT p1);
  double d;
  printf(">(x, y)");
  scanf("%d %d",&p1.x, &p1.y);
  d = distance(p1);
  printf("Distance between (%d, %d) and (0, 0) is %.2f.\n", p1.x, p1.y, d);
  return 0;
}
