package Homework;
import java.util.Scanner;


public class fib{
	public int fib1(int n){
		if(n <= 1)	return 1;
		int p = 1;
		int q = 1;
		for(int i =2; i <= n; i++)
		{
			int tmp = p;
			p = q;
			q = p + tmp;
		}
		return q;
	}
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("n = ?");
		int n = input.nextInt();
		input.close();
		fib f = new fib();
		int r = f.fib1(n);
		System.out.println("fib " + n + " = " + r);


	}
}
