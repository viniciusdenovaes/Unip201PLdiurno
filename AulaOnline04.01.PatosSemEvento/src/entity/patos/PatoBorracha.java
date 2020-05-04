package entity.patos;

public class PatoBorracha extends Pato {

	public PatoBorracha(String aNome) {
		super(aNome);
	}

	@Override
	public void nadar() {
		System.out.println("nao nada, só boia");
	}

	@Override
	public void voar() {
		System.out.println("Nao voa, só cai");
	}

}
