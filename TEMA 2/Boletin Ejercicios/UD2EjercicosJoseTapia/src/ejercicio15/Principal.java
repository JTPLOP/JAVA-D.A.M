package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definir variables
		String usuario;
		int opcionU, valor, calculos;
		
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("\nBienvenido "+usuario+". Este programa te ayudará a conocer la tabla de multiplicar del número entero que más te guste.");
		
		do {
			System.out.println("\n¿Me podrías indicar que opcíon quieres llevar a cabo?");
			System.out.println("Pulse 1 para aprender una nueva tabla de multiplicar.\nPulse 2 para dar por finalizado el aprendizaje.");
			opcionU=Leer.datoInt();
			
			switch (opcionU) {
			
				case 1: 
					System.out.println("\nDado que te interesa aprender sobre una tabla de multiplicar, ¿me podrías cúal es el valor del que te gustaria conocer su tabla de multiplicar? Indicar: ");
					valor=Leer.datoInt();
					
					System.out.println("\nCalculando valores de la tabla de multiplicar...");
					System.out.println("\n*Nota*:Dado que la definición de tabla de multiplicar dice no hay una limitación estricta; la tabla puede extenderse a cualquier rango de números enteros según la necesidad."
							+ "\nHemos decidido limitarla para hacer más dinámico el aprendizaje, por lo que se mostrará multiplicada entre el rango [1,10].\n");
					//calculos
					calculos=valor*1;
					System.out.println("El valor "+valor+"*1= "+calculos);
					calculos=valor*2;
					System.out.println("El valor "+valor+"*2= "+calculos);
					calculos=valor*3;
					System.out.println("El valor "+valor+"*3= "+calculos);
					calculos=valor*4; 
					System.out.println("El valor "+valor+"*4= "+calculos);
					calculos=valor*5;
					System.out.println("El valor "+valor+"*5= "+calculos);
					calculos=valor*6;
					System.out.println("El valor "+valor+"*6= "+calculos);
					calculos=valor*7;
					System.out.println("El valor "+valor+"*7= "+calculos);
					calculos=valor*8;
					System.out.println("El valor "+valor+"*8= "+calculos);
					calculos=valor*9;
					System.out.println("El valor "+valor+"*9= "+calculos);
					calculos=valor*10;
					System.out.println("El valor "+valor+"*10= "+calculos);
					
					System.out.println("\n---------------------------------------------------\nEspero que te haya quedado claro la tabla de multiplicar del "+valor);
					break;
					
				case 2: 
					System.out.println("El programa se ha dado por concluido.");
					break;
					
				default:
					System.out.println("Has introducido un valor erróneo, vuelva a intentarlo. \n");
			}
			
			
			
			
			
		
			
		}while(opcionU != 2);
			
			System.out.println("\n-----------------------------------------\nMuchas gracias por utilizar nuestro programa.");
			
			
		
		
		
		
		
	}

}
