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
	printf("Dynamic Connectivity: [");
	for(int x = 0; x < s; ++x){
		printf(" ( %d , %d ) ", x, id[x]);
	}
	printf(" ]");
}

int main(){
	int x, p, q, y;
	A:
	printf("Input Size of Dynamic Connectivity(less than 10000): ");
	scanf("%d",&x);
	quickfind d(x);
	printf("Input your two nodes you wanna manipulate > p, q: ");
	scanf("%d, %d", &p, &q);
	B:
	printf("Select operation: \n");
	printf("------------------------------------------\n");
	printf("0. Restart\n");
    printf("1. Union(p, q)\n");
	printf("2. Find(p, q)\n");
	printf("------------------------------------------\n");
	printf(">> ");
	scanf("%d",&y);
	switch(y){
		case 0 :
		  goto A;

		case 1 :
		  d._union(p, q);
		  goto B;

		case 2 :
		  bool c = d.find(p, q);
		  if(c == true){
			  printf("Connected!");
		  }else{
			  printf("Unconnected!");
		  }
		  goto B;



	}
	return 0;

}
