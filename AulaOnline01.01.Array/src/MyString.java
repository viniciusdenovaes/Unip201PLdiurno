
public class MyString implements Comparable<MyString>{
	
	String palavra;
	
	public MyString(String aPalavra) {
		this.palavra = aPalavra;
	}
	

	@Override
	public int compareTo(MyString other) {
		// Se this é maior que o other return um número positivo
		if(this.palavra.length()>other.palavra.length())
			return 1;
		// Se this é menor que o other return um número negativo
		if(this.palavra.length()<other.palavra.length())
			return -1;
		// Se this é igual ao other return 0
		if(this.palavra.length()==other.palavra.length())
			return 0;
		return 0;
	}
	
	@Override
	public boolean equals(Object other) {
		
		if(! (other instanceof MyString))
			return false;
		
		MyString otherMyString = (MyString) other;
		
		if(this.palavra.length() == otherMyString.palavra.length()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		return this.palavra;
	}

}
