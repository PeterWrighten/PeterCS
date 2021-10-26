# include<stdio.h>
# include<stdlib.h>

typedef struct tree{
	int x;
	struct *parent;
	struct *left;
	struct *right;

} tree;

tree *search(tree *t, int x){
	if(t == NULL){
		return NULL;
	}
	if(t->x == x){
		return 1;
	}
	if(x < t->x){
		return search(t->left, x);
	}else{
		return search(t->right, x);
	}
}

tree *insert(tree *t, int j){
	tree *i = malloc(sizeof(tree));
    i->x = j;
	
}
