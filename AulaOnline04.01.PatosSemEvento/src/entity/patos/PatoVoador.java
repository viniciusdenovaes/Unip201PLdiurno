package entity.patos;

public class PatoVoador extends Pato {

	public PatoVoador(String aNome) {
		super(aNome);
	}

	@Override
	public void nadar() {
		System.out.println("Nada Normal");
	}

	@Override
	public void voar() {
		System.out.println("Voa muito bem");
	}

}
