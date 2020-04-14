import java.util.*;


public class TesteMyString {
	
	public static void main(String[] args) {
		
		Set<MyString> minhasPalavras = new TreeSet<>();
		
		minhasPalavras.add(new MyString("abacate"));
		minhasPalavras.add(new MyString("ovo"));
		minhasPalavras.add(new MyString("bola"));
		minhasPalavras.add(new MyString("bala"));
		
		for(MyString minhaPalavra: minhasPalavras) {
			System.out.println(minhaPalavra);
		}
		
	}

}
