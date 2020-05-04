package teste;

import java.util.ArrayList;
import java.util.List;

import entity.patos.NadarBehaviorNadaBem;
import entity.patos.NadarBehaviorNadaMal;
import entity.patos.NadarBehaviorNadaNormal;
import entity.patos.Pato;
import entity.patos.QuackBehavior;
import entity.patos.QuackBehaviorMudo;
import entity.patos.VoarBehaviorVoaBem;
import entity.patos.VoarBehaviorVoaMal;
import entity.patos.VoarBehaviorVoaNormal;

public class Teste {
	
	public static void main(String[] args) {
		List<Pato> patos = new ArrayList<>();
		patos.add(new Pato("pato borracha",      new NadarBehaviorNadaMal(), new VoarBehaviorVoaMal(), new QuackBehaviorMudo()));
		patos.add(new Pato("pato pena",          new NadarBehaviorNadaMal(), new VoarBehaviorVoaNormal()));
		patos.add(new Pato("pato pena especial", new NadarBehaviorNadaMal(), new VoarBehaviorVoaBem()));
		patos.add(new Pato("pato madeira", new NadarBehaviorNadaNormal(), new VoarBehaviorVoaMal(), new QuackBehaviorMudo()));
		patos.add(new Pato("pato normal",  new NadarBehaviorNadaNormal(), new VoarBehaviorVoaNormal()));
		patos.add(new Pato("pato voador",  new NadarBehaviorNadaNormal(), new VoarBehaviorVoaBem()));
		patos.add(new Pato("pato donald",  new NadarBehaviorNadaBem(), new VoarBehaviorVoaMal()));
		patos.add(new Pato("pato nadador", new NadarBehaviorNadaBem(), new VoarBehaviorVoaNormal()));
		Pato superPato = new Pato("pato super",   new NadarBehaviorNadaBem(), new VoarBehaviorVoaBem());
		superPato.setQuackBehavior(new QuackBehavior() {
			@Override
			public void quack() {
				System.out.println("EU SOU O SUPER PATO!!!");
			}
		});
		patos.add(superPato);
		
		System.out.println("Comecando teste das acoes");
		for(Pato pato: patos) {
			System.out.println();
			System.out.println(pato.getNome());
			pato.voar();
			pato.nadar();
			pato.quack();
		}
	}

}
