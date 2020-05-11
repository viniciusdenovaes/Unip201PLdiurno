package teste;

import controller.Controller;
import view.View;

public class TesteMenu {
	
	public static void main(String[] args) {
		
		Controller c = new Controller(new View());
		c.init();
		
	}

}
