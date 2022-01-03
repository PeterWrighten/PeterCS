# include<stdio.h>
# include<stdlib.h>

typedef struct tree{
	int x;
	struct tree* parent;
	struct tree* left;
	struct tree* right;

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

tree *find_min(tree *t){
	tree *min;
	if(t == NULL){
		return NULL;
	}
	min = t;
	while(min->x != NULL){
		min = min->left;
	}
	return min;

}

tree *find_max(tree *t){
	tree *max;
	if(t == NULL){
		return NULL;
	}
	max = t;
	while(max->x != NULL){
	max = max->right;
}

return max;
}

tree *insert(tree **t, int j, tree *parent){
	tree *tmp;
	if(*t == NULL){
		tmp = malloc(sizeof(tree));
		tmp->x = j;
		tmp->parent = parent;
		*t = tmp;
		return *t;
	}
	if(j < (*t)->x){
		insert(&((*t)->left), j, *t);
	}else{
		insert(&((*t)->right), j, *t);
	}

}

int main(){

}
