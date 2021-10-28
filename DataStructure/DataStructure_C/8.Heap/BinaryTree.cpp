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
	tree *t;
	int i;
	tree *parent;
	binarytree();
	tree *search_tree(tree *t, int i);
	tree *find_min(tree *t);
	tree *find_max(tree *t);
	void insert(tree **t, int i, tree *p);
    void delete_tree(int i, tree *t);
	void traverse(tree *t);
};

binarytree::binarytree(){

}

tree *binarytree::search_tree(tree *t, int i){
	if( t == NULL){
		return NULL;
	}
	if(i == t->x ){
		return 1;
	}

	if(i > t->x){
		binarytree::search_tree(t->right, i);
	}else{
		binarytree::search_tree(t->left, i);
	}

}

tree *binarytree::find_min(tree *t){
	tree *min;
	if(t == NULL){
		return NULL;
	}

	min = t;
	while(t != NULL){
		min = min->left;
	}
	return min;

}

tree *binarytree::find_max(tree *t){
	tree *max;
	if(t == NULL){
		return NULL;
	}

	max = t;
	while(t != NULL){
		max = max->right;
	}
	return max;

}

void binarytree::insert(tree **t, int i, tree *p){
	tree *tmp;
	if( *t == NULL ){
		tmp = new tree;
		tmp->x = i;
		tmp->parent = p;
		*t = tmp;//given value
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

void binarytree::delete_tree(int i, tree *t){
	tree *tem = binarytree::search_tree(t, i);
	if(tem->left == NULL && tem->right == NULL){
		delete *tem;
	}
	if(tem->left == NULL && tem->right != NULL){
		if(tem->x < (tem->parent)->x){
			(tem->right)->parent = tem->parent;
			(tem->parent)->left = tem->right;
			delete *tem;
		}else{
			(tem->right)->parent = tem->parent;
			(tem->parent)->right = tem->right;
			delete *tem;
		}
	}

	if(tem->right == NULL && tem->left != NULL){
		if(tem->x < (tem->parent)->x){
			(tem->left)->parent = tem->parent;
			(tem->parent)->left = tem->left;
			delete *tem;
		}else{
			(tem->left)->parent = tem->parent;
			(tem->parent)->right = tem->left;
			delete *tem;
		}
	}

	if(tem->right != NULL && tem->left != NULL){
		if(tem->x < (tem->parent)->x){//left
			(tem->left)->parent = tem->parent;
			(tem->parent)->left = tem
			delete *tem;
		}else{//right
			(tem->left)->parent = tem->parent;
			(tem->parent)->right = tem->left;
		}
	}

}


int main(){
	int j[tree_size];
    tree *t[tree_size];
	int i = 0;
	while(1){
    cout<<“Input Number You Prefer”<<endl;
	cin>>j[i];
	if(j[i] == 01){
		break;
	}
	t[i] = new tree;
	t[i]->x = j[i];
	if( i != 0 ){
		if( i % 2 == 1 ){
			t[i]->parent = t[(i - 1) / 2];
			t[(i - 1) / 2]->left = t[i];
		}else{
			t[i]->parent = t[(i - 2)/2];
			t[(i - 2)/2]->right = t[i];
		}
	}
	i++;
	}

}
