
public class Threesum{
	public static int count(int[] a){
		int N = a.length;
		int count = 0;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				for(int k = 0; k < N; k++){
					if(a[i] + a[j] + a[k] == 0){
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args){
		Stopwatch t = new Stopwatch();
		Threesum s = new Threesum();
		int[] a = In.readInts(args[0]);
		System.out.println(s.count(a));
		System.out.println(t.elapsedTime());
	}
}
