package entity.patos;

public class Pato {
	
	private String nome;
	private NadarBehavior nadarBehavior;
	private VoarBehavior voarBehavior;
	private QuackBehavior quackBehavior;
	
	public Pato(String aNome, NadarBehavior aNadarBehavior, VoarBehavior aVoarBehavior) {
		this.nome = aNome;
		this.nadarBehavior = aNadarBehavior;
		this.voarBehavior = aVoarBehavior;
		this.quackBehavior = new QuackBehaviorDefault();
	}
	
	public Pato(
			String aNome, 
			NadarBehavior aNadarBehavior, 
			VoarBehavior aVoarBehavior, 
			QuackBehavior aQuackBehavior) {
		this(aNome, aNadarBehavior, aVoarBehavior);
		this.quackBehavior = aQuackBehavior;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNadarBehavior(NadarBehavior nadarBehavior) {
		this.nadarBehavior = nadarBehavior;
	}
	
	public void setVoarBehavior(VoarBehavior voarBehavior) {
		this.voarBehavior = voarBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void nadar() {
		this.nadarBehavior.nadar();
	}
	
	public void voar() {
		this.voarBehavior.voar();
	}
	
	public void quack() {
		this.quackBehavior.quack();
	}
	
}
