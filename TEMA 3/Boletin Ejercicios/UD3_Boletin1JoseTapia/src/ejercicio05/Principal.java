package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		String texto;
		int numVeces;
		int opcion;
		
		//CLASES
		
		Copiado copy;
		
		//PROGRAMA
		
		System.out.println("Bienvenido a nuestro gran programa que se encargara de repetir la frase que tu desees las veces que tu desees.");
		System.out.println("------------------------------------------");
		
		//BUCLE
		
		do {
			
			System.out.println("Elija entre una de las opciones: ");
			System.out.println("[1] Escribir texto\n[2] Terminar programa");
			opcion=Leer.datoInt();
			
			
			switch (opcion) {
			
				case 1:
					System.out.println("Introduzcas un texto: ");
					texto=Leer.dato();
					
					
					System.out.println("¿Cuantas veces deseas que se repita?\nIndicar: ");
					numVeces=Leer.datoInt();
					
					copy= new Copiado(texto,numVeces);
					
					copy.escribirFrases();
					
					break;
					
				case 2: 
					System.out.println("Saliendo del programa...");
					break;
					
				default:
					System.err.println("Valor erroneo, vuelva a intentarlo.");
					break;
			}
			
			
			
			
			
			
		}while (opcion != 2);
		
		System.out.println("\n----------------------------------------------\nMuchas gracias por utilizar el programa.");
		
		
	}

} 
