package Stack;
import java.util.Scanner;

public class Stack_resizingArray {
    private String[] s;
    private int N = 0;
    public Stack_resizingArray(){
        s = new String[1];

    }
    public void resize(int cap){
        String[] copy = new String[cap];
        for( int i = 0; i < s.length; i++){
            copy[i] = s[i];//rewrite-save
        }
        s = copy;

    }
    public boolean isEmpty() {
        return N == 0;
    }
    public void push(String item){
        if(N == s.length){
            resize( 2 * s.length );
        }
        s[N++] = item;
    }
    public String pop(){
        String i = s[--N];//s[--N]<==> N = N - 1; s[N]...
        s[N] = null;
        if( N > 0 && N == s.length/4){
            resize(s.length / 2);
        }
        return i;// prevent loitering
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Stack_resizingArray a = new Stack_resizingArray();
    while(true){
        System.out.println("1. push\n");
        System.out.println("2. pop\n");
        int j = input.nextInt();
        if(j == 1){
            System.out.println("Push: ");
            String item = input.next();
            a.push(item);
        }else{
            String p = a.pop();
            System.out.println(p);
        }
    }
        

    }


}
