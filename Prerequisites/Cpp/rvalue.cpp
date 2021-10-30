#include<iostream>
using namespace std;

//The Brand New Charactor in CPP 11


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

	Stack(Stack &&str):msize(str.msize), mtop(str.mtop){
		cout<<"Stack(Stack &&)"<<endl;
		mpstack = str.mpstack;
		str.mpstack = nullptr;
	}

	Stack& operator=(Stack &&str){
		cout<<"operator=(Stack &&str)"<<endl;

		if(this == &str){
			return *this;
		}
		delete []mpstack;
		msize = str.msize;
		mtop = str.mtop;

		mpstack = str.mpstack;
		str.mpstack = nullptr;

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
