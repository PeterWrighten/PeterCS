#include<stdio.h>
#include<stdlib.h>

typedef struct LIST{
	int data;
	struct LIST *next;
}LIST;

void *push(int x, LIST *top){
	LIST *q, *r;
	r = (LIST *)malloc(sizeof(LIST));
	q = top;
	top = r;
	top->data = x;
	top->next = q;
	return(top);


}

void *pop(LIST *top){
	if(top == NULL){
		printf("Stack Underflow!");
		exit(1);
	}
	LIST *q;
	q = top;
	top = top->next;
	free(q);
	return(top);

}

void read(LIST *top){
	LIST *q;
	q = top;
	printf("Stack:[");
	while(1){
	printf("%d ", q->data);
	q = q->next;
	if(q == NULL){
		break;
	}
}
    printf("]\n");
}


int main(){
	int x;
	int y;
	LIST *top, *ptr;
	top = NULL;
	A:
	printf("**********************\n");
	printf("What do you want to do?\n");
	printf("1-Push\n");
	printf("2-Pop\n");
	printf("3-Index\n");
	printf("4-Exit\n");
	printf("**********************\n");
	scanf("%d",&x );
	switch(x){
		case 1:
		printf("Input data you want to push> \n");
	    scanf("%d",&y);
	    top = push(y, top);
		read(top);

		 goto A;
		case 2:
		  pop(top);
		  read(top);
		  goto A;
		case 3:
		  read(top);
		  goto A;
		case 4:
		  break;
		  return 0;
		default:
		  printf("Input correct number !\n");
		  goto A;

		}

}
