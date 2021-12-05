/* This is a max-heap */

import java.util.Scanner;

public class BinaryHeap {
    private Integer[] arr;
    private int N = 0;
    public boolean isEmpty() {
        return N == 0;
    }

    public BinaryHeap(int capacity) {
        arr = new Integer[capacity + 1];
    }
    private void swim(int k) {
        while(k > 1 && arr[k / 2] < arr[k]){
            swap(k, k / 2);
            k = k / 2;
        }
    }

    public void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void insert(int k) {
        arr[++N] = k;
        swim(N);
    }

    private void sink(int k) {
        
        while(2 * k <=  N) {
            int j = 2 * k;
            if(j < N && arr[j] < arr[j + 1])    j++;
            if(arr[j] > arr[k])    swap(k, j); 
            k = j;
        }
        

    }

    public int delMax() {
        int tmp = arr[1];
        swap(1, N--);
        sink(1);
        arr[N + 1] = null;// String[] could insert null, but int[];
        return tmp;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many data do you wanna save?");
        int nums = input.nextInt();
        BinaryHeap heap = new BinaryHeap(nums);
        for(int i = 0; i < nums; i++) {
            System.out.println("Input numbers you wanna insert: ");
            int tmp = input.nextInt();
            heap.insert(tmp);
        }
        while(true) {
            System.out.println("Functions: ");
            System.out.println("1. GetMax;");
            System.out.println("2. delMax;");
            System.out.println("Others. Exit;");
            int tmp = input.nextInt();
            System.out.println("-------------------------------------");
            if(tmp == 1) {
                System.out.println(heap.arr[1]);
            } else if(tmp == 2) {
               System.out.println(heap.delMax());
            } else {
                break;
            }
            
        }

        input.close();

    }
    
}
