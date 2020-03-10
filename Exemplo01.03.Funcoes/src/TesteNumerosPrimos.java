
public class TesteNumerosPrimos {
	
	public static void main(String[] args) {
		
		int limite = 20;
		for(int numero=1; numero<=20; numero++) {
			System.out.println(
					"numero " + numero + " eh primo? " + isPrimo(numero));
		}
		
	}
	
	static boolean isPrimo(int numero) {
		if(numero == 1) {
			return false;
		}
		for(int i=2; i<=numero-1; i++) {
			if(numero%i == 0) {
				return false; 
			}
		}
		return true;
	}

}
