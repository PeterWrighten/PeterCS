#include<iostream>
#include<stdlib.h>
#define tree_size 10000
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
	tree *tem;
	int tmp;
	binarytree();
	tree *root(tree *t);
	tree *search_tree(tree *t, int i);
	tree *find_min(tree *t);
	tree *find_max(tree *t);
	tree *insert(tree **t, int i, tree *p);
    void delete_tree(int i, tree *t);
	void traverse(tree *t);
	void inorder(tree *t);
};

binarytree::binarytree(){
	tem = new tree();

}

tree *binarytree::root(tree *t){
	tem = t;
	while(tem != NULL){
		tem = tem->parent;
	}
	return tem;
}

tree *binarytree::search_tree(tree *t, int i){
	if( t == NULL){
		return NULL;
	}
	if(i == t->x ){
		return t;
	}

	if(i > t->x){
		return binarytree::search_tree(t->right, i);
	}else{
		return binarytree::search_tree(t->left, i);
	}

}

tree *binarytree::find_min(tree *t){

	if(t == NULL){
		return NULL;
	}

	tem = t;
	while(t != NULL){
		tem = tem->left;
	}
	return tem;

}

tree *binarytree::find_max(tree *t){

	if(t == NULL){
		return NULL;
	}

	tem = t;
	while(t != NULL){
		tem = tem->right;
	}
	return tem;

}

tree *binarytree::insert(tree **t, int i, tree *p){
	if( *t == NULL ){
		tem->x = i;
		tem->parent = p;
		*t = tem;//given value
		return *t;
	}
	if( (*t)->x < i ){
		binarytree::insert(&((*t)->right),i, *t);
	}else{
		binarytree::insert(&((*t)->left),i, *t);
	}
}

void binarytree::traverse(tree *t){
	cout<<"This Tree's Data:"<<t->x<<endl;
	cout<<"Left Subtree's Data:"<<(t->left)->x<<endl;
	cout<<"Right Subtree's Data:"<<(t->right)->x<<endl;
}

void binarytree::inorder(tree *t){
	if(t == NULL){
		return;
	}
	if( (t->left)->x > t->x ){
		tmp = (t->left)->x;
		(t->left)->x = t->x;
		t->x = tmp;

	}
    if( (t->right)->x <= t->x ){
		tmp = (t->right)->x;
		(t->right)-> = t->x;
		t->x = tmp;
	}
	if(t->right == NULL){
		binarytree::inorder(t->left);
	}else{
		binarytree::inorder(t->right);
	}


}

void binarytree::delete_tree(int i, tree *t){
	tree *tr = binarytree::search_tree(*t, i);
	tem = tr->parent;
	if(tem == NULL){
		cout<<"Warning!! It is the root, if you forcely delete it, all of your data would be deleted!"<<endl;

	}
	tree *min = binarytree::find_min(tr);
	tr->x = min->x;
	delete min;
	binarytree::inorder(tem);


}


int main(){

	binarytree btree = new binarytree();
	int t;
	int x;
	tree *tree[tree_size];


	cout<<"Operation Menu: "<<endl;
	cout<<"-------------------------------"<<endl;
	cout<<"1. find max"<<endl;
	cout<<"2. find min"<<endl;
	cout<<"3. insert"<<endl;
	cout<<"4. delete"<<endl;
	cout<<"5. search"<<endl;
	cout<<"6. traverse"<<endl;
	cout<<"-------------------------------"<<endl;
	cin>>x;

	switch(x){
		case 1:
            btree.find_max(tree[0]);

		case 2:

		case 3:

		case 4:

		case 5:

		case 6:

	}



}
