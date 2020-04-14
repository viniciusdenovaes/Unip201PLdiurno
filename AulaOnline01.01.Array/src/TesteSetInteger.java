import java.util.Set;
import java.util.TreeSet;

public class TesteSetInteger {
	
	public static void main(String[] args) {
		Set<Integer> inteiros = new TreeSet<>();
		
		inteiros.add(1);
		inteiros.add(7);
		inteiros.add(4);
		inteiros.add(0);
		inteiros.add(4);
		inteiros.add(4);
		
		for(int a: inteiros) {
			System.out.println(a);
		}
	}

}
