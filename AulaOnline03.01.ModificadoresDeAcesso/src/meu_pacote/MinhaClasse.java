package meu_pacote;

//import outro_pacote.ClasseDefaultOutroPacote;
import outro_pacote.ClasseOutroPacote;
import outro_pacote.SuperClasseOutroPacote;

/*
|           │ Class │ Package │ Subclass │ Subclass │ World  |
|           │       │         │(same pkg)│(diff pkg)│        |
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|public     │   +   │    +    │    +     │     +    │   +    | 
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|protected  │   +   │    +    │    +     │     +    │        | 
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|no modifier│   +   │    +    │    +     │          │        | 
|───────────┼───────┼─────────┼──────────┼──────────┼────────|
|private    │   +   │         │          │          │        |
|___________|_______|_________|__________|__________|________|
 + : accessible         blank : not accessible
*/

public class MinhaClasse extends SuperClasseOutroPacote{
	
	public int varPublic;
	protected int varProtected;
	int varDefault;
	private int varPrivate;
	
	@Override
	protected int metodo() {
		return 2;
	}
	
//	@Override
//	protected int metodoFinal() {
//		return 2;
//	}
	
	public void teste() {
		
		this.varPublic = 1;
		this.varProtected = 1;
		this.varDefault = 1;
		this.varPrivate = 1;
		
		OutraClasseMesmoPacote otrClsMsmPct = new OutraClasseMesmoPacote();
		otrClsMsmPct.varPublic = 1;
		otrClsMsmPct.varProtected = 1;
		otrClsMsmPct.varDefault = 1;
		//otrClsMsmPct.varPrivate = 1;
		
		super.varPublic = 1;
		super.varProtected = 1;
//		super.varDefault = 1;
//		super.varPrivate = 1;
		
		ClasseOutroPacote clsOtrPct = new ClasseOutroPacote();
		clsOtrPct.varPublic = 1;
//		clsOtrPct.varProtected = 1;
//		clsOtrPct.varDefault = 1;
//		clsOtrPct.varPrivate = 1;
		
//		ClasseDefaultOutroPacote clsDfltOtrPct = new ClasseDefaultOutroPacote();
		
		System.out.println("Funcionou");
		
	}
	
	public static void main(String[] args) {
		
		MinhaClasse mc = new MinhaClasse();
		mc.teste();
		
	}

}





