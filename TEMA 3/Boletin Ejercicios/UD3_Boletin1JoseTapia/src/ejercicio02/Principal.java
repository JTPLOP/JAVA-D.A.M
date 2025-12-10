package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARAR ATRIBUTOS
		double radio, resultado;
		int opcion;
		
		Circulo c1;
		//ESTRUCTURA PROGRAMA
		
		System.out.println("Bienvenido, este programa se encarga de calcular el área.");
		do {
		System.out.println("\n¿Podrías elegir entre estas opciones?");
		System.out.println("[1] Calcular área en cm2\n[2] Calcular área en m2\n[0] Salir del programa");
		opcion=Leer.datoInt();
		
		switch (opcion) {
		case 1: {
			System.out.println("¿Podrías decirme el valor del radio?");
			radio=Leer.datoDouble();
			c1 =new Circulo (radio);
			
			resultado= c1.calcArea();
			
			System.out.printf("El área sera %.2f cm2.\n",resultado);
			break;
		}
		
		case 2: {
			System.out.println("¿Podrías decirme el valor del radio?");
			radio=Leer.datoDouble();
			c1 =new Circulo (radio);
			
			resultado= c1.areaM2();
			System.out.printf("El área sera %.8f m2.\n",resultado);
			break;
		}
		
		case 0: {
			
			System.out.println("El programa ha finalizado");
			break;
		}
		
		default:
			System.err.println("El valor introducido es erroneo vuelva a introducirlo.");
		}
		
		
		}while (opcion != 0);
	}

}
