package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES	
		int [] boleto;
		int [] sorteo;
		int tam=5,desde=0, hasta=9;
		int attempsort=0, attempboleto=0;


		
		boleto= new int [tam];
		sorteo= new int [tam];
		
		//CLASE
		SorteoLoteria navidad;
		int opcion,opcion2;
		
		//PROGRAMA
		
		System.out.println("Bienvenido a este programa encargado de gestionar los sorteos de lotería.");
		navidad= new SorteoLoteria();
		do {
			System.out.println("Escoja una opción: ");
			System.out.println("[1] Comprar un décimo\n[2] Hacer un sorteo\n[3] Comprobar el premiado\n[0] Cerrar programa");
			opcion=Leer.datoInt();
			attempboleto++;
			
			switch (opcion) {
			
				case 1: 
					System.out.println("--------------------------------\nComprar Décimo\n--------------------------------");
					System.out.println("En esta sección usted podrá adquirir un número para la lotería, ahora bien tienes dos opciones para elegirlos:");
					do {
						System.out.println("[1] Elegir número mediante teclado\n[2] Elegir número aleatoriamente");
						opcion2=Leer.datoInt();
						
						switch (opcion2) {
						
							case 1:
								System.out.println("Usted escogio elegirlo por si mismo, adelante indiqueme el valor");
								
								for (int i = 0; i < boleto.length; i++) {
									System.out.println("\n¡Formato del boleto es XXXXX donde cada x corresponde a un digito con rango [0-9]!");
									System.out.println("Su boleto actual es: ");
									for (int j = 0; j < boleto.length; j++) {
										System.out.print(boleto[j]);
									}
									
									 do{
										System.out.println("\nIndiqueme el "+(i+1)+" valor: ");
										boleto[i]=Leer.datoInt();
										
										switch (boleto[i]) {
										
										case 0,1,2,3,4,5,6,7,8,9: 
											break;
										default:
											System.err.println("-----------------------------------------------------------\nEl valor seleccionado es erroneo, vuelva a intentarlo.\n-----------------------------------------------------------");
											break;
										}
										
									}while (boleto[i] <= 0 || boleto[i] >= 9);
								
									
								}
								
								navidad.mostrarBoleto(boleto);
								
								break;
								
							case 2: 
								System.out.println("Usted escogio la opcion más pussy (aleatoriamente)...");
								
								for (int i = 0; i < boleto.length; i++) {
									boleto[i] = navidad.crearBoleto(navidad.crearRandom(desde, hasta));
								}
								
								navidad.mostrarBoleto(boleto);
								break;
							default: 
								System.err.println("-----------------------------------------------------------\nEl valor seleccionado es erroneo, vuelva a intentarlo.\n-----------------------------------------------------------");
						}
						break;
								
					}while (opcion2 == 1 && opcion2 == 2);
					
				case 2:
					System.out.println("Usted ha decidido hacer un sorteo (lo que es lo mismo que promover la ludopatia... pero eso es otro tema...)");
					System.out.println("Los formatos de los boletos son: XXXXX donde en cada X va un digito que se encuentra en un rango de [0-9].");
					for (int i = 0; i < boleto.length; i++) {
						boleto[i] = navidad.crearBoleto(navidad.crearRandom(desde, hasta));
					}
					
					navidad.mostrarBoleto(sorteo);
					System.out.println("Ahora toca reaccionar a las caritas de lloros, disfruta...");
					attempsort++;
					break;
					
				case 3: 
					System.out.println("Esta sección te ayudará a verificar a los ganadores.\n");
					
					if (attempsort == 0 ) {
						System.out.println("Usted debe hacer un sorteo para poder comprobar ganador");
					}else if (attempboleto == 0){
						System.out.println("Usted debe hacer un recibir un boleto para poder participar.");
					}else {
						System.out.println("El boleto ganador fue: ");
						for (int i = 0; i < sorteo.length; i++) {
							System.out.print(sorteo[i]);
						}	
						
						navidad.mostrarGanador(navidad.descubrirGanador(boleto, sorteo));
						
					}
					break;
			}
			
		}while (opcion!=0);
		
		
	}

}
