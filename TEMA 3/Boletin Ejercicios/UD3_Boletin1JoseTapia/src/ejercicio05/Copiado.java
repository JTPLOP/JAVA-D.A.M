package ejercicio05;

import java.util.Iterator;

public class Copiado {

	//ATRIBUTOS
	
	private String texto;
	
	private int numVeces;
	
	// CONSTRUCTOR
	
	public Copiado (String texto, int numVeces) {
		this.texto=texto;
		this.numVeces=numVeces;
		
	}
	
	public Copiado () {
		
	}
	
	// METODOS
	
	public void escribirFrases () {
		
		for (int i = 0; i < numVeces; i++) {
			
			System.out.println((i+1)+". "+texto);
			
		}
		System.out.println();
		
	}
	
	
}
