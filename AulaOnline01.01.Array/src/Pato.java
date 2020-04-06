
public class Pato {
	
	private String nome;
	private int idade;
	
	public Pato(String aNome, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "nome: " + this.nome + "\n";
		res += "idade: " + this.idade + "\n";
		return res;
	}

}
