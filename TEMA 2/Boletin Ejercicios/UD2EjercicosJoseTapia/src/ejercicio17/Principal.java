package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuario;
		int opcionU, asignaturas, aprobado=5, numS=0;
		double valor, valorF=0, media;
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("\nBienvenido "+usuario+". Este programa te ayudará con la gestión de notas de los alumnos del centro.");
		
		do { 
			System.out.println("\n¿Me podrías indicar que opcíon quieres llevar a cabo?");
			System.out.println("Pulse 1 para gestionar las notas de un nuevo alumno.\nPulse 2 para dar por finalizado la gestión.");
			opcionU=Leer.datoInt();
			
			switch (opcionU) { 
				case 1: 
					System.out.println("¿Me podrías decir cuántas asignaturas hay?");
					asignaturas=Leer.datoInt();
					for (int i=0; i<asignaturas ;i++) { 
						System.out.println("Ingrese el valor de una asignatura");
						valor=Leer.datoDouble();
						
						valorF=valorF+valor;
						
						System.out.println("Anotando...\n");
						if (valor < aprobado) { 
							numS++;
						}
						
					}
					
					media=valorF/asignaturas;
					System.out.println("Calculando...");
					System.out.printf("\nEl alumno tiene de nota media un %.2f y un total de %d suspensos.\n",media,numS);
					System.out.println("\n--------------------------------------------------------");
					break;
					
				case 2: 
					System.out.println("El programa se ha dado por concluido.");
					break;
				default:
					System.out.println("Has introducido un valor erróneo, vuelva a intentarlo. \n");
			}

		}while (opcionU != 2);

			System.out.println("\n------------------------------------------\nMuchas gracias por utilizar el programa.");
		
	}

}
