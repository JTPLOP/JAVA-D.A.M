package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARAR VARIABLES
		int opcion, valor;
	
		Operaciones op;
		// ESTRUCTURA PROGRAMA
		
		System.out.println("Bienvenido a este programa, ¿podrías escoger entre las opciones?");
		
		//Estructura bucle
		
		do {
			System.out.println("[1] Conocer su polaridad \n[2] Conocer su paridad\n[3]Salir del programa");
			opcion=Leer.datoInt();
			
			switch (opcion) {
			
			case 1:
				System.out.println("¿Podrías decirme el valor que quieras comprobar?\nIndicar:");
				valor=Leer.datoInt();
				op = new Operaciones ();
				op.polaridad(valor);
				break;
			
			case 2:
				System.out.println("¿Podrías decirme el valor que quieras comprobar?\nIndicar:");
				valor=Leer.datoInt();
				op = new Operaciones ();
				op.paridad(valor);
				break;
				
			case 0: 
				System.out.println("Saliendo del programa...");
				break;
				
			default:
				System.err.println("Has introducido un valor erroneo, vuelva a intentarlo.\n");
			
			}
			
			
		}while (opcion != 0);
		
		System.out.println("\n--------------------------\nMuchas gracias por utilizarnos.");
	}

}
