import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TesteTreeMap {
	
	public static void main(String[] args) {
		
		Map<String, Pessoa> pessoasPorCPF = new TreeMap<>();
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("12345", "Ana"));
		pessoas.add(new Pessoa("12345", "Bia"));
		pessoas.add(new Pessoa("12300", "Cal"));
		pessoas.add(new Pessoa("12300", "Dal"));
		pessoas.add(new Pessoa("92345", "Efe"));
		
		for(Pessoa pessoa: pessoas) {
			pessoasPorCPF.put(pessoa.getCpf(), pessoa);
		}
		
		for(String cpf: pessoasPorCPF.keySet()) {
			System.out.println("Para o cpf " + cpf);
			System.out.println(pessoasPorCPF.get(cpf));
		}
		
		System.out.println(pessoasPorCPF.get("12345"));
		
		
	}

}
