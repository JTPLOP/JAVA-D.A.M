package ejercicio06;

import java.util.Iterator;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definir variables
		
		String [] asunto;
		double [] precio;
		int tam;
		
		
		
		System.out.println("Bienvenido usuario, este programa se encarga de impresión en consola.");
		System.out.println("¿Cuántos espacios quieres añadir?");
		tam=Leer.datoInt();
		
		asunto= new String [tam];
		precio= new double [tam];
		
		System.out.println("Perfecto, ahora necesito que me rellenes los siguientes datos: ");
		
		for (int i = 0; i < precio.length; i++) {
			
			System.out.println("Escriba el nombre de un producto: ");
			asunto[i]=Leer.dato();
			
			System.out.println("\nAhora escriba su precio");
			precio[i]=Leer.datoDouble();
			
			System.out.println("\nAnotando...");
			
			
		}
		System.out.println("\nPedido:\n----------------------------");
		System.out.printf("Item: ");
		
		for (int i = 0; i < precio.length; i++) {
			
			
			System.out.print("\t"+asunto[i]);

			
		}
		
		System.out.printf("\nPrecio: ");
		
		for (int i = 0; i < precio.length; i++) {
			
			
			System.out.printf(" %.2f€\t",precio[i]); // se recomienda utilizar 1 for y 1 if en este caso de impresion ya que nos ahorramos 3 procesos que tiene que llevar a cabo el segundo for
			
		}

		//Impresion
			
		
		
		
		
	}

}
