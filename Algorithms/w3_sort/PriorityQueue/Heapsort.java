import java.util.Scanner;

public class Heapsort {
    private Integer[] pq;
    private int size;
    public Heapsort(int N) {
        pq = new Integer[N + 1];
    }

    private void swap(int i, int j) {
        int tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;
    }
    
    private void swim(int k) {
        while( k > 1 && pq[k] > pq[k / 2]) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while( 2 * k <= size ) {
            int j = 2 * k;
            if(j < size && pq[j] < pq[j + 1]) { j++; }
            if(pq[k] < pq[j])   swap(k, j);
            k = j;
        }
    }

    public void insert(int k) {
        pq[++size] = k;
        swim(size);
    }

    public int delMax() {
        int tmp = pq[1];
        swap(1, size--);
        sink(1);
        pq[size + 1] = null;
        return tmp;
    }

    public void heapsort() {
    while(size > 0) {
        swap(1, size--);
        sink(1);
    }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many data do you wanna save?");
        int nums = input.nextInt();
        Heapsort heap = new Heapsort(nums);
        for(int i = 0; i < nums; i++) {
            System.out.println("Input numbers you wanna insert: ");
            int tmp = input.nextInt();
            heap.insert(tmp);
        }
        while(true) {
            System.out.println("Functions: ");
            System.out.println("1. GetMax;");
            System.out.println("2. delMax;");
            System.out.println("3. heapsort;");
            System.out.println("Others. Exit;");
            int tmp = input.nextInt();
            System.out.println("-------------------------------------");
            if(tmp == 1) {
                System.out.println(heap.pq[1]);
            } else if(tmp == 2) {
               System.out.println(heap.delMax());
            } else if(tmp == 3) {
                heap.heapsort();
                for(int i = 1; i <= nums; i++) {
                    System.out.println(heap.pq[i]);
                }
            } else {
                break;
            }

        }

        input.close();
    }
}
