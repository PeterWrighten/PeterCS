#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#define SIZE 100


typedef struct Node{
    char item[SIZE];
    struct Node *next;
}Node;

Node *first;
Node *last;

bool isEmpty(){
    return first == NULL;
}

void enqueue(char i[SIZE]){
    Node *oldlast = last;
    last = malloc(sizeof(Node));  
    *(last->item) = i;
    last->next = NULL;
    if(isEmpty()){
        first = last;

    }else{
        oldlast->next = last;
    }


}

char dequeue(){
    char j = first->item;
    Node *tem = first;
    first = first->next;
    if(isEmpty()){
        last = NULL;
    }
    free(tem);
    return j;
}


int main(){
    first = NULL;
    last = NULL;
    char tmp[SIZE];
    int k;
    while(1){
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        scanf("%d", &k);
        switch(k){
            case 1:
                printf("Input a String: ");
                fflush(stdin);
                fgets(tmp, SIZE, stdin);
                enqueue(tmp);
            case 2: 
                *tmp = dequeue();
                fflush(stdout);
                puts(tmp);
            default:
                continue;
        }   
    }

    

}    