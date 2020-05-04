package entity.patos;

abstract public class Pato {
	
	private String nome;
	
	public Pato(String aNome) {
		this.nome = aNome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	abstract public void nadar();
	
	abstract public void voar();
	
}
