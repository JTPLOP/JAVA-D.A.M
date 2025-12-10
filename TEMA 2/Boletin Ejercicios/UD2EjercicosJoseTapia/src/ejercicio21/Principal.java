package ejercicio21;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuario;
		int opcionU;
		double valor, valorF=0;		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("\nBienvenido "+usuario+". Este programa es una calculadora.");
		
		do { 
			System.out.println("\n¿Me podrías indicar que opcíon quieres llevar a cabo?");
			System.out.println("Pulse 0 para salir de la calculadora.\nPulse 1 para sumar.\nPulse 2 restar.\nPulse 3 multiplicar.\nPulse 4 dividir.\nPulse 5 para saber si es par o impar.");
			opcionU=Leer.datoInt();
			
			switch (opcionU) {
				case 1: 
					System.out.println("\n¿Me podrías indicar cuantos valores vas a querer sumar?"); //no preguntar cuantos valores va a querer sumar, analogia mercadona y carro de compra.
					opcionU=Leer.datoInt();
					
					if (opcionU < 2) {
						System.out.println("La cantidad de veces que ha marcado nos impide realizar la suma, vuelva a intentarlo.");
						break;
					}
					
					for (int i=0; i < opcionU ; i++) {
						
						System.out.println("Ingrese un valor: ");
						valor=Leer.datoDouble();
						
						valorF=valorF+valor;
						
						System.out.println("Anotando...\n");
					}
					
					System.out.printf("\nEl resultado de la suma equivale a: %.2f.",valorF);
					System.out.println("\n--------------------------------------------------------");
					valorF=0;
					break;

				case 2: 
					System.out.println("\n¿Me podrías indicar cuantos valores vas a querer restar?");
					opcionU=Leer.datoInt();
					
					if (opcionU < 2) {
						System.out.println("La cantidad de veces que ha marcado nos impide realizar la resta, vuelva a intentarlo.");
						break;
					}
					
					for (int i=0; i < opcionU ; i++) {
						
						System.out.println("Ingrese el primer valor: ");
						valor=Leer.datoDouble();
						
						valorF=valorF-valor;
						
						System.out.println("Anotando...\n");
					}
					
					System.out.printf("\nEl resultado de la resta equivale a: %.2f.",valorF);
					System.out.println("\n--------------------------------------------------------");					valorF=0;
					break;

				case 3: 
					System.out.println("\n¿Me podrías indicar cuantos valores vas a querer multiplicar?");
					opcionU=Leer.datoInt();
					
					if (opcionU < 2) {
						System.out.println("La cantidad de veces que ha marcado nos impide realizar la multiplicación, vuelva a intentarlo.");
						break;
						
						
					}
					
					valorF++;
					for (int i=0; i < opcionU ; i++) {
						
						System.out.println("Ingrese un valor: ");
						valor=Leer.datoDouble();
						
						
						valorF=valor*valorF;
						
						System.out.println("Anotando...\n");
					}
					
					System.out.printf("\nEl resultado de la multiplicación equivale a: %.2f.",valorF);
					System.out.println("\n--------------------------------------------------------");					
					valorF=0;
					break;

				case 4: 
				 // en las divisiones nos pide que si el divisor es cero poner error
				// para tener una mayor retencion podriamos meter un bucle en la division para cuando meta un cero 
					// cambiar bucle for por bucle while
					valorF++;
					for (int i=0; i<opcionU ; i++) {
						
						System.out.println("Ingrese un valor: ");
						valor=Leer.datoDouble();
						
						valorF=valor/valorF;
						
						System.out.println("Anotando...\n");
					}
					
					System.out.printf("\nEl resultado de la division equivale a: %.2f.",valorF);
					System.out.println("\n--------------------------------------------------------");
					valorF=0;
					break;
				case 5:
					System.out.println("Ingrese un valor: ");
					valor=Leer.datoDouble();
					valorF=valor%2;
					
					if (valorF == 0) {
						System.out.println("\nEl valor es par.");
						System.out.println("--------------------------------------------------------");

					}else {
						System.out.println("\nEl valor es impar.");
						System.out.println("--------------------------------------------------------");


					}
					break;
				case 0: 
					System.out.println("El programa se ha dado por concluido.");
					break;
						
				default: 
					System.out.println("Has introducido un valor erróneo, vuelva a intentarlo. \n");
					
					
			}
			
		} while(opcionU !=0);
			
		System.out.println("\n------------------------------------------\nMuchas gracias por utilizar el programa.");
	
	}
		

}
