
public class Pato implements Comparable<Pato>{
	
	private int id;
	private String nome;
	
	public Pato(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		
		if(outro==null) {
			return false;
		}
		
		if(this.getClass()!=outro.getClass()) {
			return false;
		}
		
		Pato outroPato = (Pato)outro;
		
		if(this.getId() != outroPato.getId()) {
			return false;
		}
		
		if(! this.getNome().equals(outroPato.getNome())) {
			return false;
		}
		
		return true;
		
	}
	
	@Override
	public int compareTo(Pato outro) {
		
		if(this.getId() != outro.getId()) {
			return Integer.compare(this.getId(), outro.getId());
		}
		
		if(! this.getNome().equals(outro.getNome()) ) {
			return this.getNome(). compareTo (outro.getNome());
		}
		
		return 0;
	}
	
	

	@Override
	public String toString() {
		return "Pato [id=" + id + ", nome=" + nome + "]";
	}

	

}
