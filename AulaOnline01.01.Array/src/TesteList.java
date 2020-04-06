import java.util.ArrayList;
import java.util.List;

public class TesteList {
	
	public static void main(String[] args) {
		
		List<Pato> patos = new ArrayList<>();
		
		patos.add(new Pato("Ana", 1));
		patos.add(new Pato("Bia", 2));
		patos.add(new Pato("Carla", 3));
		patos.add(patos.get(0));
		
		for(Pato pato: patos) {
			System.out.println(pato);
		}

		
	}

}
