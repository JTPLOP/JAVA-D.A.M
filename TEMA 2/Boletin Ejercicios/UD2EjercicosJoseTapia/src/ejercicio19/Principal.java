package ejercicio19;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuario;
		int opcionU, sueldoB=1000, porc=20, den=100;
		double totalVend, sueldoF, dinVentas;
		
		
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("\nBienvenido "+usuario+". Este programa te ayudará a calcular el salario mensual de un vendedor.");
		
		do { 
			System.out.println("\n¿Me podrías indicar que opcíon quieres llevar a cabo?");
			System.out.println("Pulse 1 para gestionar el salario de un nuevo vendedor.\nPulse 2 para dar por finalizado la gestión.");
			opcionU=Leer.datoInt();
			
			switch (opcionU) { 
				case 1: 
					System.out.println("¿Me podrías decir cuánto ha vendido en total el trabajador (en un lapso de 1 mes)?");
					totalVend=Leer.datoDouble();
					
					//calculos
					dinVentas=totalVend*porc/den;
					sueldoF=dinVentas+sueldoB;
					
					System.out.printf("\nEl salario mensual del vendedor constará de %d€ como sueldo fijo, y de %.2f€ de las ventas que ha generado.",sueldoB, dinVentas);
					System.out.printf("\nEn total el trabajador deberá cobrar %.2f€.",sueldoF);
					System.out.println("\n---------------------------------------------");
					break;
					
				case 2: 
					System.out.println("El programa se ha dado por concluido.");
					break;
				default:
					System.out.println("Has introducido un valor erróneo, vuelva a intentarlo. \n");
					
			}
		
		
			}while (opcionU !=2);
		
			System.out.println("\n------------------------------------------\nMuchas gracias por utilizar el programa.");
		
	}

}
