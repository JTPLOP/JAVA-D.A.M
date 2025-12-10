package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuario, dia, afirmativo="s";
		double precio,precioF, miercoles, precioX;
		int entradas, den=100;
		
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("Bienvenido "+usuario+". Este programa se encarga de calcular el precio por entrar en el cine.");
		System.out.println("¿Podrías indicarme el número de entradas?");
		entradas=Leer.datoInt();
		
		System.out.println("\nAnotando...");
		System.out.println("Bien, ¿podrías indicarme ahora el precio de las entradas?");
		precio=Leer.datoDouble();
		
		//Calculos generales
		precioF=entradas*precio;
		
		
		System.out.println("\nAnotando...");
		System.out.println("Ya casí lo tenemos, ¿podrías indicarme si hoy es miércoles? (Responda utilizando s (para afirmativo) / n (para negativo)");
		dia=Leer.dato();
		
		if (dia.equals(afirmativo)) {
			
			System.out.println("\nCalculando...");
			System.out.printf("\nCon un total de %d entradas, el precio total sin descuento es de %.2f€",entradas,precioF);
			System.out.println("\nSin embargo, dado que hoy miércoles se le aplicará un descuento, ¿podrías indicarme de cuánto es el descuento? ");
			miercoles=Leer.datoDouble();
			precioX=precioF-precioF*miercoles/den;
			
			System.out.printf("\nEn conclusión, el precio total con el descuento aplicado es de %.2f€",precioX);
		}else { 
			System.out.println("Si no es miércoles, ¿me podrías decir que día es hoy?");
			dia=Leer.dato(); 
			System.out.printf("\nCon un total de %d entradas, el precio total es de %.2f€",entradas,precioF);
			System.out.println("\nAl ser "+dia+" no se recibirá ningún descuento.");
		}
		
		System.out.println("\n--------------------------------\nMuchas gracias por utilizar el programa.");	
	}

}
