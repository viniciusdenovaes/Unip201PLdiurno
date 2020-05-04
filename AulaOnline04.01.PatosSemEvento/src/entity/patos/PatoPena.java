package entity.patos;

public class PatoPena extends Pato {

	public PatoPena(String aNome) {
		super(aNome);
	}

	@Override
	public void nadar() {
		System.out.println("nao nada, só boia");
	}

	@Override
	public void voar() {
		System.out.println("Voa Normal");
	}

}
