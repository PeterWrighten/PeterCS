import java.util.Scanner;

public class quickfind{
	private int[] id;
	public quickfind(int i){
		id = new int[i];
		for(int j = 0; j < i; ++j){
			id[j]=j;
		}
	}

	public boolean find(int p, int q){
		return id[p] == id[q];
	}

	public void union(int p, int q){
		if(id[p] == id[q]){
			System.out.println("Connected! Please change another pair of node!");
		}else{
			int pid = id[p];
			int qid = id[q];
			for(int j = 0; j < id.length; ++j){
				if(id[j] == pid){
					id[j] = qid;
				}
			}
			System.out.println("Dynamic Connectivity: [");
			for(int x = 0; x < id.length; ++x){
				System.out.println(" ("+ x + "," + id[x] + ") ");
			}
			System.out.println(" ]");
		}

	}

	public static void main(String[] args){
		quickfind d = new quickfind(9);
		Scanner input = new Scanner(System.in);
		System.out.println()

	}
}
