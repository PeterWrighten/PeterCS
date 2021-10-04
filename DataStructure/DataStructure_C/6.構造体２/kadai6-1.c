#include<stdio.h>

typedef struct point{
    int x;
    int y;
} POINT;

typedef struct middle{
    double x;
    double y;
} MIDDLE;

MIDDLE getMiddlePoint(POINT p1, POINT p2){
    MIDDLE p3;
    p3.x = (double)(p1.x + p2.x)/2;
    p3.y = (double)(p1.y + p2.y)/2;
    return p3;
}

int main(){
    POINT p1;
    POINT p2;
    MIDDLE p3;
    printf(">(x1, y1)");
    scanf("%d %d",&p1.x,&p1.y);
    printf(">(x2, y2)");
    scanf("%d %d",&p2.x,&p2.y);
while(scanf("%d %d",&p1.x,&p1.y) != EOF && scanf("%d %d",&p2.x,&p2.y) != EOF){
    p3 = getMiddlePoint(p1, p2);
    printf("Middle point between (%d, %d) and (%d, %d) is (%.2f, %.2f).",p1.x,p1.y,p2.x,p2.y,p3.x,p3.y);
    return 0;
}
}
