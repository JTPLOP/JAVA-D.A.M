package ejemploChati;

import utilidades.Leer;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar variables
		
		String usuario;
		int opcion;
		String [] participantes;
		int [] puntuacion;
		int tam;
		int hasta=99, desde=0;
		Random r= new Random (System.nanoTime());
		
		//Introduccion Antes del menu
		
		System.out.println("Podria decirme tu nombre?: \nIndicar: ");
		usuario=Leer.dato();
		
		System.out.println("\nBienvenido "+usuario+", este es un programa enfocado a facilitar la gestion de los participantes en la competicion.");
		System.out.println("Empezemos con lo basico, cuantos participantes vas a querer registrar? Indicar: ");
		tam=Leer.datoInt();
		
		
		participantes = new String [tam];
		puntuacion= new int [tam];
		
		System.out.println("Perfecto... ahora pasemos a los nombres: ");
		
		for (int i = 0; i < participantes.length; i++) {
			System.out.println("\nEscribe el nombre de un participante: ");
			participantes [i]=Leer.dato();
			
			System.out.println("\nBien, ahora vamos a introducirle una puntuacion aleatoria.");
			puntuacion[i]=r.nextInt(hasta-desde+1)+desde;
			
			System.out.println("\nLa puntuacion asignada para '"+participantes[i]+"' es: ");
			System.out.println("-----------------\n"+puntuacion[i]+"\n-----------------");
			
		}
		// Estructura menu
		
			
			
			
			System.out.println("Preguntar opciones a escoger");
			System.out.println(" Opciones tenemos 5 opciones");
			opcion=Leer.datoInt();
			
			switch (opcion) {
			
				case 1: 
				
					
			
				case 2: 
				
				
				case 3: 
				
				
				case 4: 
				
				
				case 0: 
					System.out.println("El programa ha concluido...");
				
				
				default: 
					
					System.out.println("El valor que has introducido es erroneo, vuelva a intentarlo");
					break;
				
		}
			
		}while (opcion!= 0);
		
			
	}

}
