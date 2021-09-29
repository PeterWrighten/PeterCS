int main(){
    int i,j;
    for(i=1;i<=7;i++){
        for(j=1;j<=i;j++){
            printf("mod(%d,%d)=%d\n",i,j,i%j);
        }
            printf("------------------------------\n");
    }
            return 0;
}
