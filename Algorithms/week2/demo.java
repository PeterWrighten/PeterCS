public class demo {
    public static void main(String[] args){
        int[] s = new int[100];
        int N = 0;
        s[N++] = 10;
        System.out.println("s: " + s[N] + " s[N-1]: " + s[N-1] + " N: " + N);
        s[N++] = 20;
        System.out.println("s: " + s[N] + " s[N-1]: " + s[N-1] + " N: " + N);
        int item = s[--N];
        System.out.println("s: " + s[N] + " s[N-1]: " + s[N-1] + " N: " + N + "item: " + item);
    }
}
