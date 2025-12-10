package ejercicio03;

import java.util.Iterator;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar variables
		double media;
		int [] valores; 
		int tam=8, suma=0, num0=0;
		valores= new int [tam];
		
		
		System.out.println("Este programa te calculará la media de los "+tam+" leídos.");
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Introduzca un valor: ");
			valores[i]=Leer.datoInt();
			if (valores [i] == 0) {
				num0++;
			}
			
		}
		for (int i = 0; i < valores.length; i++) {
			suma=suma+valores[i] ;
		}
		
		media=suma/valores.length;
		System.out.printf("La media de los valores propuestos es de: %.2f",media);
		System.out.println("\nLas veces que ha indicado 0 son: "+num0);
	
		
	}

}
