#include<iostream>
#define size 10000
using namespace std;

class quickfind{
private:
	int id[size];
public:
	int s;
	quickfind(int i);
	bool find(int p, int q);
	void _union(int p, int q);
};

quickfind::quickfind(int i){
	s = i;
	for(int j = 0; j < i; ++j){
		id[j] = j;
	}
}

bool quickfind::find(int p, int q){
	return id[p] == id[q];
}

void quickfind::_union(int p, int q){
	int pid = id[p];
	int qid = id[q];
	for(int z = 0; z < s; ++z){
		if(id[z] == pid){
			id[z] = qid;
		}
	}
	cout<<"Dynamic Connectivity: ["<<endl;
	for(int x = 0; x < s; ++x){
		cout<<"("<<x<<" , "<<id[x]<<")"<<endl;
	}
	cout<<" ]"<<endl;
}

int main(){
	int x, p, q, y;
	A:
	cout<<"Input Size of Dynamic Connectivity(less than 10000): "<<endl;
	cin>>x;
	quickfind d(x);

	B:
	cout<<"Select operation: \n"<<endl;
	cout<<"------------------------------------------\n"<<endl;
	cout<<"0. Restart\n"<<endl;
    cout<<"1. Union(p, q)\n"<<endl;
	cout<<"2. Find(p, q)\n"<<endl;
	cout<<"------------------------------------------\n"<<endl;
	cout<<">> "<<endl;
	cin>>y;
	switch(y){
		case 0 :
		  goto A;

		case 1 :
		  cout<<"Input your two nodes you wanna manipulate > p, q: "<<endl;
	      cin >> p >> q;
		  d._union(p, q);
		  goto B;

		case 2 :
		  cout<<"Input your two nodes you wanna manipulate > p, q: "<<endl;
	      cin >> p >> q;
		  bool c = d.find(p, q);
		  if(c == true){
			  cout<<"Connected!"<<endl;
		  }else{
			  cout<<"Unconnected!"<<endl;
		  }
		  goto B;



	}
	return 0;

}
