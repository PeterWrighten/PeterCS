
import java.util.Scanner;

class Info{
	public int start;
	public int end;
	public int time;
	public int salary;
	public Info pre;
}

public class DP{
	private Info[] w;
	Scanner input = new Scanner(System.in);
	public DP(int n){
		w = new Info[n];
		for(int i = 0; i < n ; ++i){
			j = i + 1;
			System.out.println("No." + j + "'s Start Time: ");
			w[i].start = input.nextInt();
			System.out.println("No." + j + "'s End Time: ");
			w[i].end = input.nextInt();
			w[i].time = w[i].end - w[i].start;
			System.out.println("No." + j + "'s Salary: ");
			w[i].salary = input.nextInt();
		}

	}


	public void dynamicP(){

	}


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many groups of data do you wanna DP? > ");
		int n = input.nextInt();
		DP p = new DP(n);
	}





}
