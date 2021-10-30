#include<iostream>
using namespace std;

class Stack{
public:
	Stack(int size = 1000):msize(size), mtop(0){
		cout<<"Stack(int)"<<endl;
		mpstack = new int[size];
	}
	~Stack(){
		cout<<"~Stack()"<<endl;
		delete []mpstack;
		mpstack = nullptr;
	}

	Stack(const Stack &str):msize(str.msize), mtop(str.mtop){
		cout<<"Stack(const Stack &str)"<<endl;
		mpstack = new int[str.msize];
		for(int i = 0; i < mtop; ++i){
			mpstack[i] = str.mpstack[i];
		}
	}

	Stack& operator=(const Stack &str){
		cout<<"operator="<<endl;
		if(this == &str){
			return *this;
		}
		delete []mpstack;
		msize = str.msize;
		mtop = str.mtop;
		mpstack = new int[str.msize];
		for(int i = 0; i < mtop; ++i){
			mpstack[i] = str.mpstack[i];
		}
		return *this;

	}
	int getSize(){
		return msize;
	}
private:
	int *mpstack;
	int mtop;
	int msize;

};

Stack GetStack(Stack &stack){
	Stack tmp(stack.getSize());
	return tmp;
}

int main(){
	Stack s;
	s = GetStack(s);
	return 0;
}
