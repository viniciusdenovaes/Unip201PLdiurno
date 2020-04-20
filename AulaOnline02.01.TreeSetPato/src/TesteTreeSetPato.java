import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSetPato {
	
	public static void main(String[] args) {
		
		Set<Pato> patos = new TreeSet<>();
		
		patos.add(new Pato(10, "Donaldo"));
		patos.add(new Pato(11, "Donaldo"));
		patos.add(new Pato(10, "Margarida"));
		patos.add(new Pato(10, "Donaldo"));
		patos.add(new Pato(10, "Margarida"));
		
		for(Pato pato: patos) {
			System.out.println(pato);
		}
		
	}

}
