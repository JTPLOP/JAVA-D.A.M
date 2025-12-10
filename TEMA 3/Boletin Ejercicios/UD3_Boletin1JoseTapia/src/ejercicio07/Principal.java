package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//VARIABLES
		int opcion, opcion2, valorUsu=0;
		int desde=1, hasta=50;
		
		//CLASES
		JuegoMoneda m1;
		
		
		// PROGRAMA
		
		System.out.println("Bienvenido a este programa que simula un juego de cara o cruz.");
		
		//BUCLE
		
		do {
			System.out.println("Elija una opcion:");
			System.out.println("[1] Jugar cara o cruz\n[0] Cerrar programa");
			opcion=Leer.datoInt();
			
			switch (opcion) {
					
				case 1:
						System.out.println("Usted ha seleccionado jugar al cara o cruz.");
						do {
							System.out.println("\nNecesito que me digas si vas a elegir cara o cruz.");
							System.out.println("[1] Cara\n[2] Cruz");
							opcion2=Leer.datoInt();
						
						switch (opcion2) {
						
							case 1,2:
								valorUsu=opcion2;
								break;
							default:
								System.err.println("El valor es erroneo, vuelva a introducirlo.\n");
								
						}
						
						}while(opcion2 !=1 && opcion2 !=2);
						
						m1=new JuegoMoneda();
						
						m1.LanzMoneda(desde, hasta);
						m1.aleatorio(valorUsu);
						m1.mostrarResultado(valorUsu);
										
						
					break;
				
				case 0: 
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Valor erroneo, vuelva a intentarlo...");
				
				break;

			}

			
		}while (opcion != 0);
		
		
	}

}
