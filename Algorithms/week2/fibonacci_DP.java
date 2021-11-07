import java.util.Scanner;


public class fib{
	public int fib1(int n){
		if(n == 1 || n == 2){ return 1; }
		int pre1 = 1;
		int pre2 = 1;
		int j;
		if(n % 2 == 0){j = (n - 2) / 2;}else{j = (n - 2) / 2 + 1;}
		for(int i = 0; i <= j; ++i){
			pre1 += pre2;
			pre2 += pre1;
		}
		if(n % 2 == 0){ return pre2; }else{return pre1;}
	}
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("n = ?");
		int n = input.nextInt();
		fib f = new fib();
		int r = f.fib1(n);
		System.out.println("fib " + n + " = " + r);


	}
}
