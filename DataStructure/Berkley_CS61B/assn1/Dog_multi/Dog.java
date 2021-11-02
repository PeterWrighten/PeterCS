public class Dog{
	public int weight;
	public Dog(int w){
		weight = w;
	}
	public void makeNoise(){
		if(weight < 10){
			System.out.println("Yip!");
		}else if(weight < 30){
			System.out.println("Wooooh!");
		}else{
			System.out.println("Bark!");

		}

	}
}
