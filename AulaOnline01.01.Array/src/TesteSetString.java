import java.util.Set;
import java.util.TreeSet;

public class TesteSetString {
	
	public static void main(String[] args) {
		
		Set<String> palavras = new TreeSet<>();
		
		palavras.add("ana");
		palavras.add("abacate");
		palavras.add("bola");
		palavras.add("bala");
		
		for(String palavra: palavras) {
			System.out.println(palavra);
		}
		
		
	}

}
