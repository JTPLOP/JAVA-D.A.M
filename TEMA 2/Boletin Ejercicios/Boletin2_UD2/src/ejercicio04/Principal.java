package ejercicio04;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		
		int [] numAleatorio;
		int [] posicion;
		int tam=10, opcion,elemento, cantE=0;
		int desde=1, hasta=10, suma=0;
		double media;
		
		numAleatorio= new int [tam]; //aunque no lo pida es recomendable hacerlo en forma de menu
		posicion = new int [tam];
		
		System.out.println("Bienvenido usuario a este programa.");
		
		do {
			
			System.out.println("\n¿Podría escoger entre las opciones?\n------------------------------------\nPulse 1 para generar aleatorio\nPulse 0 cerrar programa");
			opcion=Leer.datoInt();
			
			switch (opcion) { 
				case 1:
					Random r= new Random (System.nanoTime());
					
					System.out.println("Este programa te generara "+tam+" números aleatorios, te mostrará la suma de todos los números generados y te dará la media de todos.\nLista de números aleatorios:\n----------------------------");
					//random
					for (int i = 0; i < numAleatorio.length; i++) {
						numAleatorio[i]=r.nextInt(hasta-desde+1)+desde;
						
						System.out.println((i+1)+" Número: "+numAleatorio[i]+"\n----------------------------");
							
					}
					//suma
					for (int i = 0; i < numAleatorio.length; i++) {
						suma+=numAleatorio[i];
					}
					
					System.out.println("\nEl resultado de la suma de todos los valores generados es: "+suma);
					
					//media
					
					media=(double) suma/numAleatorio.length;
					
					System.out.printf("La media de los valores generados es %.2f\n",media);
					
					
					System.out.println("\nAhora vamos a buscar si se ha generado un valor.\nIntroduzca el valor que quiera buscar: ");
					elemento=Leer.datoInt();
					
					for (int i = 0; i < numAleatorio.length; i++) {
						
						if(numAleatorio[i] == elemento) {
							cantE++;
							
						}
					}
					
					if (cantE>0) {
						System.out.println("\nLa cantidad de veces que aparece el valor "+elemento+" es: "+cantE);
						
						do {
							System.out.println("¿Te gustaría saber la posición del valor?\nPulse 1 para buscar valor\nPulse 0 para no buscar");
							opcion=Leer.datoInt();
							
							switch (opcion) {
							
								case 1:
									
									
									for (int i = 0; i < numAleatorio.length; i++) {
										
										if (numAleatorio[i] == elemento) {
											
											posicion[i]=i;
										
									}
									}
									
									System.out.println("\nEl valor seleccionado aparece en los siguientes espacios: ");
									
									for (int i = 0; i < numAleatorio.length; i++) {
										
										if(posicion[i]
												System.out.println(posicion[i]);
									}
									
								case 0:
									System.out.println("\nHa escogido no buscar el valor seleccionado.");
									
								default: 
									
									System.out.println("Valor incorrecto, vuelva a intentarlo.\n");
									break;
							
							
							}
							
							}while (opcion !=0);
							
					}else {
						System.out.println("El valor seleccionado no aparece entre los números aleatorios.");
					}
					
					
					
					
					break;

				
				case 0: 
					System.out.println("\nEl programa ha finalizado.");
					
					break;

				default:
					System.out.println("\nEl valor que has introducido es erróneo.");
					
					break;

			}
		
		
	
		}while (opcion !=0);
		
		System.out.println("\n-----------------------------------\nMuchas gracias por utilizar el programa.");
	}

}
