#include<iostream>
using namespace std;
template<class T>

class Stack{

private:
    struct Node{
    public:
        T item;
        Node *next;
    };
    Node *top = NULL;
    T i;
public:
    void push(T i){
         Node *oldtop = top;
        top = new Node();
        top->item = i;
        top->next = oldtop;

    };
    void pop(){
        Node *p = top;
        top = top->next;
        delete p;
    };    
};

int main(){
    Stack<int> *s = new Stack<int>();

}



