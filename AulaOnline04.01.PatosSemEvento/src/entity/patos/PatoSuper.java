package entity.patos;

public class PatoSuper extends Pato {

	public PatoSuper(String aNome) {
		super(aNome);
	}

	@Override
	public void nadar() {
		System.out.println("Nada muito bem");
	}

	@Override
	public void voar() {
		System.out.println("voa muito bem");
	}

}
