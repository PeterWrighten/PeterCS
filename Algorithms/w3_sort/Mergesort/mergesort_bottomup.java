
import java.lang.Math;
import java.util.Scanner;

public class mergesort_bottomup {
    public void merge(int[] arr, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        int k = 0;
        int len = hi - lo + 1;
        int[] res = new int[len];
        while(k < res.length) {
            if(i > mid)     res[k++] = arr[j++];
            else if(j > hi)      res[k++] = arr[i++];
            else if(arr[i] < arr[j])     res[k++] = arr[i++];
            else     res[k++] = arr[j++];
        }

        for(int x = 0, y = lo; x < len; x++, y++) {
            arr[y] = res[x];
        }
    }


    public void sort(int[] arr) {
        int N = arr.length;
        for(int sz = 1; sz < N; sz += sz) {
            for(int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(arr, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a;
        int i;
        System.out.println("How many numbers do you wanna input ?");
        i = input.nextInt();
        a = new int[i];
        for(int j = 0; j < i; j++)
        {
            System.out.println("The number you wanna sort>> ");
            a[j] = input.nextInt();
        }
        input.close();
        System.out.println("-----------------------------------------");
        mergesort_bottomup sort = new mergesort_bottomup();
        sort.sort(a);
        for(int k : a) {
            System.out.println(k);
        }
    }
    
}
