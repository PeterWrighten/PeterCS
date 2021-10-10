#include<stdio.h>
#include<stdlib.h>

typedef struct LIST{
	int data;
	struct LIST *next;
}LIST;

void *push(int x, LIST *top){
	LIST *p, *q;
  p = malloc(sizeof(LIST));
  if(p == NULL){
	  fprintf(stderr, "Memory is not enough!\n");
  }
  q = top;
  top = p;
   if(x == 0){
	   exit(1);
   }
   p->data = x;
   p->next = q->next;
   q->next = p;
   return(top);
   printf("Finished Input %d\n",p->data);

}

void *pop(LIST *top, LIST *ptr){
	top->next = ptr->next;
	free(ptr);
	printf("Completed! \n");

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

		 goto A;
		case 2:
		  pop(top, ptr);
		  goto A;
		case 3:
		  goto A;
		case 4:
		  break;
		  return 0;
		default:
		  printf("Input correct number !\n");
		  goto A;

		}

}
