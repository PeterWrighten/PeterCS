#include <stdlib.h>
#include <stdio.h>

typedef struct cell{
	int element;
	struct cell *next;
} CELL;

void *push(int x, CELL *init){
	CELL *q, *r;
	r = malloc(sizeof(CELL));
	q = init;
	init = r;
	init->element = x;
	init->next = q;
	return(init);
}

void *pop(CELL *init){
	CELL *q;
	if(init != NULL){
		q = init;
		init = init->next;
		free(q);
		return(init);
	}else{
		printf("Stack Underflow!\n");
		exit(1);
	}
}

void printstack(CELL *init){
	CELL *p;
	p = init;
	printf("\t");
	printf("Stack:[");

	while(p != NULL){
		printf("%d ",p->element);
		p = p->next;
	}
	printf("]\n");
	fflush(stdout);
}

int main(){
	CELL *init, *q;
	int i, x;
	init = NULL;
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
		while(1){
		  printf("input> ");
		  scanf("%d",&x);
		  if(x == 0){
			  break;
		  }
		  init = push(x,init);
		  printstack(init);
	  }
		 goto A;

		case 2:
		i = 1;
	    q = init;
	    while(q != NULL){
		  printf("pop %d times to pop",i,init->element);
		  init = pop(init);
		  q = init;
		  i++;
		  printstack(init);
	    }
		  goto A;

		case 3:
		  printstack(init);
		  goto A;

		case 4:
		  break;
		  return 0;

		default:
		  printf("Input correct number !\n");
		  goto A;
}


	return 0;
}
