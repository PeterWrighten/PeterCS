#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>


typedef struct Node{
    char item;
    Node *next;
}Node;

Node *first;
Node *last;

bool isEmpty(){
    return first == NULL;
}

void enqueue(char i){
    Node *oldlast = last;
    last = malloc(sizeof(Node));
    last->item = i;
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
    

}    