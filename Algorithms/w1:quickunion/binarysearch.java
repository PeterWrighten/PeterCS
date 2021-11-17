
import java.util.Scanner;

public class binarysearch{
	public int search(int[] a, int key){
		int l0 = 0, r0 = a.length - 1;
		while(l0 <= r0){
			int mid = (l0 + r0) / 2;
			if(key < a[mid]){
				r0 = mid - 1;
			}else if(key > a[mid]){
				l0 = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;

	}

	public static void main(String[] args){
		int[] x = {1, 2, 3, 4, 9, 13};
		int k;
		binarysearch b = new binarysearch();
		Scanner input = new Scanner(System.in);
		System.out.println("Input the key you wanna search: ");
		k = input.nextInt();
		int r = b.search(x, k) + 1;
		System.out.println("The arrayNum of "+ k + " is " + r);
	}
}
