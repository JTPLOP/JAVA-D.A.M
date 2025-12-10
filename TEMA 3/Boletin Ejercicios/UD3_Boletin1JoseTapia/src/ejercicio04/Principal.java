package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLES
		int opcion;
		double altura, total, radio;
		
		//DECLARAR CLASE
		Volumen v1;
		
		//ESTRUCTURA PROGRAMA
		
		System.out.println("Bienvenido a este programa!\n------------------------------------");
		
		do {
			System.out.println("Escoja entre las opciones segun te convenga:");
			System.out.println("[1] Calcular volumen\n[0] Salir del programa");
			opcion=Leer.datoInt();
			
			switch (opcion) {
			case 1: {
				
				System.out.println("Indicame la altura del cilindro: ");
				altura=Leer.datoDouble();
				
				System.out.println("Indicame el radio del cilindro: ");
				radio=Leer.datoDouble();
				v1= new Volumen (altura,radio);
				
				total=v1.calcVol();
				System.out.printf("El volumen será de: %.2f m3\n",total);
				
				break;
			}
			
			case 0: {
				System.out.println("Saliendo del programa...");
				
				break;
			}
			
			
			default:
				System.out.println("Has introducido un valor incorrecto, vuelva a intentarlo.\n");
			}
			

		}while (opcion != 0);
		System.out.println("\n-----------------------------\nMuchas gracias por utilizar el programa.");
		
		
		
	}

}
