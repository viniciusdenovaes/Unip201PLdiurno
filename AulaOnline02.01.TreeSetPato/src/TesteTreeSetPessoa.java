import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSetPessoa {
	
	public static void main(String[] args) {
		Set<Pessoa> pessoas = new TreeSet<>();
		
		pessoas.add(new Pessoa("12345", "Ana"));
		pessoas.add(new Pessoa("12345", "Bia"));
		pessoas.add(new Pessoa("12300", "Cal"));
		pessoas.add(new Pessoa("12300", "Dal"));
		pessoas.add(new Pessoa("92345", "Efe"));
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa);
		}
	}

}
