
public class TesteArray {
	
	public static void main(String[] args) {
		
		Pato[] patos = new Pato[4];
		
		patos[0] = new Pato("Ana", 1);
		patos[1] = new Pato("Bia", 2);
		patos[2] = new Pato("Carla", 3);
		patos[3] = patos[0];
		
		for(int i=0; i<patos.length; i++) {
			System.out.println("patos[" + i + "]: \n" + patos[i]);
		}
		
		System.out.println("for each\n");
		for(Pato pato : patos ){
			System.out.println(pato);
		}
		
		
		
	}

}
