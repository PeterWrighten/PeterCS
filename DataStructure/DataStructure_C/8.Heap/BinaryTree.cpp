#include<iostream>
#include<stdlib.h>
using namespace std;

struct tree{
public:
	int x;
	struct tree *left;
	struct tree *right;
	struct tree *parent;
};

class binarytree{
public:
	tree *t;
	int i;
	tree *parent;
	binarytree();
	~binarytree(){};
	tree *search_tree(tree *t, int i);
	void insert(tree **t, int i, tree *p);
	tree *find_min(tree *t);
	tree *find_max(tree *t);
    void delete_tree(int x, tree *t);
	void traverse(tree *t);
};

binarytree::binarytree(){
	int x[];

	while(1){
    cout<<“Input Number You Prefer”<<endl;
    }
}
