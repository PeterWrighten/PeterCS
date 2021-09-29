
#include<stdio.h>
#include<math.h>
#define pi 3.1415926535898
#define DEC (pi/180)

typedef struct point{
    int x;
    int y;
} pt;

typedef struct rotate{
    double x;
    double y;
} rt;

pt rotetePoint(pt *p1, int dt){
    pt p2;
    p2 = *p1;
    p1->x = p1->x * cos(dt * DEC) - p1->y * sin(dt * DEC);
    p1->y = p2.x * sin(dt * DEC) + p1->y * cos(dt * DEC);

}

int main(){
    pt p1;
    int dt;
    printf(">(x, y)");
    scanf("%d %d",&p1.x,&p1.y);
    printf(">(dt)");
    scanf("%d",&dt);
    //while(scanf("%d",&dt) != EOF){
        rotetePoint(&p1, dt);
        printf("(%d, %d)",p1.x,p1.y);
        return 0;
    //}
}
