package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor,valorS=0, valorP=1;
		int veces=10;
		
		System.out.println("Hola, esta aplicacion te va a mostrar la suma y el producto de "+veces+" valores.");
		
		for (int i=0; i<veces ; i++) {
			
		System.out.println("Introduceme un valor: ");
		valor=Leer.datoDouble();

		valorS=valor+valorS;
		valorP=valor*valorP;
		
		System.out.printf("\nEl valor actual de la suma es %.2f",valorS);
		System.out.printf("\nEl valor actual del producto es %.2f",valorP);
		System.out.println("\n-----------------------------------------\n");

			
		}
		System.out.printf("\nEl valor final tras la suma de los valores %d veces es de: %.1f",veces,valorS);
		System.out.printf("\nEl valor final tras la suma de los valores %d veces es de:  %.1f",veces,valorP);
		System.out.println("\n--------------------------------------\nMuchas gracias por utilizar el programa.");
	}

}
