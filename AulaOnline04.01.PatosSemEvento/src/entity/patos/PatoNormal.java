package entity.patos;

public class PatoNormal extends Pato {

	public PatoNormal(String aNome) {
		super(aNome);
	}

	@Override
	public void nadar() {
		System.out.println("Nada Normal");
	}


	@Override
	public void voar() {
		System.out.println("Voa Normal");
	}

}
