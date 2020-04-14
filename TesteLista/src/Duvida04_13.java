
public class Duvida04_13 {
	
	public static boolean isPrimo(int numero) { 
		int cont = 0; 
		for(int i = 2; i < numero+1; i++) { 
			if(numero % i == 0) { 
				cont += 1; 
			} 
		} 
		if (cont == 1) { 
			return true; 
		}else { 
			return false; 
		} 
	}
	
	
	
	public static void main(String[] args) {
		
		int n = 4;
		
		if(isPrimo(n)) {
			System.out.println(n + " eh primo");
		}
		else {
			System.out.println(n + " nao eh primo");
		}
		
	}
	
} 

