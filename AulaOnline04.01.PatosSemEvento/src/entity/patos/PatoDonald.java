package entity.patos;

public class PatoDonald extends Pato {

	public PatoDonald(String aNome) {
		super(aNome);
	}

	@Override
	public void nadar() {
		System.out.println("Nada muito bem");
	}

	@Override
	public void voar() {
		System.out.println("Nao voa, só cai");
	}

}
