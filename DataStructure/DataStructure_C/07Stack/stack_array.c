#include <stdio.h>
#include <stdlib.h>

#define STACK_SIZE 5

int array[STACK_SIZE];
int stack_ptr = 0;



void push(int x) {
    if(stack_ptr >= STACK_SIZE) {
        printf("Overflow!");
    }
    array[stack_ptr++] = x;
}

int pop() {
    if(stack_ptr <= 0)  printf("Underflow!");
    int last = array[stack_ptr - 1];
    array[stack_ptr-1] = 0; // intend to use NULL
    stack_ptr--;
    return last;
}

int main() {
    int temp;
    for(int i = 0; i < 5; i++) {
        printf("Input the number you prefer:");
        scanf("%d", &temp);
        push(temp);
    }

    for(int i = 0; i < 5; i++) {
        printf("pop %d index: %d\n", i, pop());
    }

    return 0;
}

