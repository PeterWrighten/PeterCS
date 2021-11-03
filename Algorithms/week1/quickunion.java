public class quickunion{
	private int[] id;
	public quickunion(int N){
		id = new int[N];
		for(int i = 0; i < id.length; ++i){
			id[i] = i;
		}

	}

	public int root(int p){
		while(id[p] != p){
			p = id[p];
		}
		return p;
	}

	public boolean find(int p, int q){
		return root(p) == root(q);

	}

	public void union(int p, int q){
		if(root(p) == root(q)){
			System.out.println("Connected! Change another node! ");
		}else{
			id[root(p)] = root(q);
			System.out.println("Dynamic Connectivity: [");
			for(int x = 0; x < id.length; ++x){
				System.out.println(" ("+ x + "," + id[x] + ") ");
			}
			System.out.println(" ]");
		}
	}

	public static void main(String[] args){
		quickunion d = new quickunion(9);
		d.union(0, 2);
		d.union(1, 7);
		d.union(8, 2);
		d.union(3, 5);
		d.union(5, 3);
	}



}
