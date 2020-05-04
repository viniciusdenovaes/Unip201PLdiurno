package teste;

import java.util.ArrayList;
import java.util.List;

import entity.patos.Pato;
import entity.patos.PatoBorracha;
import entity.patos.PatoDonald;
import entity.patos.PatoMadeira;
import entity.patos.PatoNadador;
import entity.patos.PatoNormal;
import entity.patos.PatoPena;
import entity.patos.PatoPenaEspecial;
import entity.patos.PatoSuper;
import entity.patos.PatoVoador;

public class Teste {
	
	public static void main(String[] args) {
		List<Pato> patos = new ArrayList<>();
		patos.add(new PatoBorracha("pato borracha"));
		patos.add(new PatoPena("pato pena"));
		patos.add(new PatoPenaEspecial("pato pena especial"));
		patos.add(new PatoMadeira("pato madeira"));
		patos.add(new PatoNormal("pato normal"));
		patos.add(new PatoVoador("pato voador"));
		patos.add(new PatoDonald("pato donald"));
		patos.add(new PatoNadador("pato nadador"));
		patos.add(new PatoSuper("Super Pato"));
		
		for(Pato pato: patos) {
			System.out.println();
			System.out.println(pato.getNome());
			pato.voar();
			pato.nadar();
		}
	}

}
