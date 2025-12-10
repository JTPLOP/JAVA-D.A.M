package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		String asignatura, fecha;
		int aula;
		Cabecera c1;
		

		
		//Pedir datos
		System.out.println("Bienvenido a nuestro programa que te facilitara la modulacion de cabeceras.");
		System.out.println("\nIndicame el nombre de la asignatura");
		asignatura=Leer.dato();
		
		System.out.println("\nIndicame ahora el aula: ");
		aula=Leer.datoInt();
		
		System.out.println("\nFinalmente indicame la fecha:");
		fecha=Leer.dato();
		
		
		c1 = new Cabecera (asignatura, aula, fecha);
		c1.modelarCabecera();
		
		
		System.out.println("\nMuchas gracias");
		
	}

}
