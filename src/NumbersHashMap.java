import java.util.HashMap;
import java.util.Random;

public class NumbersHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Double>store=new HashMap<>();
		Random r=new Random();
		int max=50;
		double range=15.5;
		double min=4;
		for(int i=0;i<10;i++) {
			int x=(int)(r.nextInt(max));
			double y=range+r.nextDouble()-min;
			store.put(x, y);
			System.out.println(x+" "+y);
		}
		System.out.println(" ");
		System.out.println(store);
		
	}

}
