package entity.patos;

public class PatoMadeira extends Pato {

	public PatoMadeira(String aNome) {
		super(aNome);
	}

	@Override
	public void nadar() {
		System.out.println("Nada Normal");
	}

	@Override
	public void voar() {
		System.out.println("Nao voa, só cai");
	}

}
