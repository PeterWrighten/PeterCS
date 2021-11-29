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

			for(int x = 0; x < id.length; ++x){
				int y = x;
				if(y == root(y)){
					continue;
				}else{
				System.out.println("Tree" + x + ": ");
				while(y != id[y]){
					System.out.println(y + "-" );
					y = id[y];
				}
				System.out.println( y + " -- \n");
				System.out.println("---------------------------\n");
			}
			}
			System.out.println("+++++++++++++++++++++++++++++++\n");
		}
	}

	public static void main(String[] args){
		quickunion d = new quickunion(9);
		d.union(3, 2);
		d.union(4, 5);
		d.union(5, 3);
		d.union(7, 5);

	}



}
