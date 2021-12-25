#include<iostream>
#include<string>
using namespace std;


class Queue{
private:
    struct Node{
        string item;
        Node *next;
    };
    Node *first, *last;
public:
    Queue(){
        first = NULL;
        last = NULL;
    }
    bool IsEmpty();
    void enqueue(string);
    string dequeue();

};

bool Queue::IsEmpty(){
    return first == NULL;
}

void Queue::enqueue(string i){
    Node *oldlast = last;
    last = new Node();
    last->item = i;
    last->next = NULL;
    if(Queue::IsEmpty()){
        first = last;
    }else{
        oldlast->next = last;
    }


}

string Queue::dequeue(){
    string j = first->item;
    Node *tem = first;
    first = first->next;
    if(IsEmpty()){
        last = NULL;
    }
    delete tem;
    return j;

}

int main(){
    Queue q;
    int i;
    while(1){
        cout<<"1. Enqueue"<<endl;
        cout<<"2. Dequeue"<<endl;
        cin>>i;
        if(i == 1){
            string k;
            cout<<"String: "<<endl;
            cin>>k;
            q.enqueue(k);
        }else if( i == 2 ){
            string s = q.dequeue();
            cout<< s <<endl;
        }
    }

}