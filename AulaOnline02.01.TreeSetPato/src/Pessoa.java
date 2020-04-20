
public class Pessoa implements Comparable<Pessoa>{
	
	private String cpf;
	private String nome;
	public Pessoa(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object outro) {
		if(this==outro) {
			return true;
		}
		
		if(! (outro instanceof Pessoa)) {
			return false;
		}
		
		Pessoa outroPessoa = (Pessoa)outro;
		
		return this.getCpf().equals(outroPessoa.getCpf());
	}
	
	@Override
	public int compareTo(Pessoa outro) {
		return this.getCpf().compareTo(outro.getCpf());
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + "]";
	}
	

}
