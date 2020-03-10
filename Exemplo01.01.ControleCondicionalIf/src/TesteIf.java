
public class TesteIf {
	
	public static void main(String[] args) {
		
		int numeroPlacaDeCarro;
		
		numeroPlacaDeCarro = 1234;
		boolean resposta = verificaNumeroPlaca(numeroPlacaDeCarro);
		System.out.println("Placa " + numeroPlacaDeCarro + " valida? " + resposta);
		
		numeroPlacaDeCarro = -5;
		resposta = verificaNumeroPlaca(numeroPlacaDeCarro);
		System.out.println("Placa " + numeroPlacaDeCarro + " valida? " + resposta);
		
		numeroPlacaDeCarro = 12345;
		resposta = verificaNumeroPlaca(numeroPlacaDeCarro);
		System.out.println("Placa " + numeroPlacaDeCarro + " valida? " + resposta);
		
	}
	
	// Verifica se o numero da placa esta entre 0 e 9999
	static boolean verificaNumeroPlaca(int numero) {
		if( (numero > 0) && (numero <= 9_999)) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
