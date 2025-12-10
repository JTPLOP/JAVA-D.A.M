package ejemplosCondicionesMultiples;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int ejemplo;
		System.out.println("Introduce un numerin");
		ejemplo=Leer.datoInt();
		
		switch (ejemplo) {
			case 1: {
			System.out.println("Mostrar este texto");
			}
		
			case 2: {
			System.out.println("Mostrar texto 2");
			}
			default: {
			throw new IllegalArgumentException("Valor no esperado " + ejemplo);
			}	
		}

	}
}


