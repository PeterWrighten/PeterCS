#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int ele;
    struct Node* next;
} Node;

Node* new(int ele) {
    Node* init = (Node*) malloc(sizeof(Node));
    init->ele = ele;
    init->next = NULL;
    return init;
}

Node* push(Node* top, int x) {
    if(top == NULL) {
        return new(x);
    } else {
        Node* new_top = new(x);
        new_top->next = top;
        return new_top;
    }
}

int get(Node* top) {
    if(top == NULL) {
        printf("Underflow!");
        exit(1);
    }
    return top->ele;
}

Node* pop(Node* top) {
    if(top == NULL) {
        printf("Underflow!");
        exit(1);
    } 
    Node* tmp = top;
    top = top->next;
    free(tmp);
    return top;
}

int main(void) {
    Node* top = NULL;
    int ele;
    while(1) {
        printf("input element:");
        scanf("%d", &ele);
        if(ele == 0) break;
        top = push(top, ele);
    }
    while(1) {
      ele = get(top);
      top = pop(top);
      printf("%d\n", ele);
    }
}
