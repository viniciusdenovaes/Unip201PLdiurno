package entity.patos;

public class PatoPenaEspecial extends Pato {

	public PatoPenaEspecial(String aNome) {
		super(aNome);
	}

	@Override
	public void nadar() {
		System.out.println("nao nada, só boia");
	}

	@Override
	public void voar() {
		System.out.println("Voa Bem");
	}

}
