package ejemplo_OperacionesArrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		int tam;
		int [] edades;
		int elemento;
		double media;
		
		System.out.println("Bienvenido usuario.\nIndique cuantos espacios quieres: ");
		tam=Leer.datoInt();
		edades=new int [tam];
		
		for (int i=0; i < edades.length ; i++) { 
			
			System.out.println("Escriba un valor: ");
			edades[i]=Leer.datoInt();
			
		}
		// MOSTRAR SELECCIONADO 
		System.out.println("¿Que elemento quieres mostrar? Indicar: ");
		elemento=Leer.datoInt();
		
		System.out.println("El elemento seleccionado tiene el valor de: "+edades[elemento-1]);
			
		//  SUMAR TODOS LOS ELEMENTOS
			
		for (int i = 0; i < edades.length; i++) { 
			
			suma=edades[i]+suma;
			
			
		}
		System.out.println("El resultado de todos los valores es: "+suma);
		media=(double) suma/edades.length;
		
		System.out.printf("La media de los valores será de: %.2f",media);
		
	}

}
