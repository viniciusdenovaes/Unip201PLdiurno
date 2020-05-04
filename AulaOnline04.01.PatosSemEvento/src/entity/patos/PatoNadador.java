package entity.patos;

public class PatoNadador extends Pato {

	public PatoNadador(String aNome) {
		super(aNome);
	}

	@Override
	public void nadar() {
		System.out.println("Nada muito bem");
	}

	@Override
	public void voar() {
		System.out.println("Voa normal");
	}

}
