package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definir variables
		int salas, entradas;
		String nombre;
		double precios, vip=20,tresD=15,normal=10,kids=7.5,precioFinal;
		
		System.out.println("Introduzca su nombre: ");
		nombre=Leer.dato();
		
		System.out.println("Bienvenido "+nombre+", esto es un menu sobre el catálogo del cine, ¿podrías decirme cúal sala es la que desea?");
		System.out.println("\n------CATÁLOGO DEL CINE------");
		System.out.println("'1' Sala VIP: Resacón en las Vegas\n'2' Sala 3D: Interestelar\n'3' Sala Normal: El señor de los anillos \n'4' Sala para niños: Torrente 5");
		salas=Leer.datoInt();
		
		switch (salas) {
		case 1: 
			precios=vip;
			System.out.printf("\nUsted a seleccionado la sala VIP.\nEl precio de la entrada es de &.1f€",precios);
			
			System.out.println("\n¿Y cuántas entradas deseas?");
			entradas=Leer.datoInt();
			precioFinal=precios*entradas;
			System.out.printf("\nEl total ha sido de %.1f€",precioFinal);
			break;
		case 2: 
			precios=tresD;
			System.out.printf("\nUsted a seleccionado la sala VIP.\nEl precio de la entrada es de &.1f€",precios);
			System.out.println("\n¿Y cuántas entradas deseas?");
			entradas=Leer.datoInt();
			precioFinal=precios*entradas;
			System.out.printf("\nEl total ha sido de %.1f€",precioFinal);
			break;
		case 3: 
			precios=normal;
			System.out.printf("\nUsted a seleccionado la sala VIP.\nEl precio de la entrada es de &.1f€",precios);
			System.out.println("\n¿Y cuántas entradas deseas?");
			entradas=Leer.datoInt();
			precioFinal=precios*entradas;
			System.out.printf("\nEl total ha sido de %.1f€",precioFinal);
			break;
		case 4: 
			precios=kids;
			System.out.printf("\nUsted a seleccionado la sala VIP.\nEl precio de la entrada es de &.1f€",precios);
			System.out.println("\n¿Y cuántas entradas deseas?");
			entradas=Leer.datoInt();
			precioFinal=precios*entradas;
			System.out.printf("\nEl total ha sido de %.1f€",precioFinal);
			break;
			
		default:
			System.out.println("Usted ha seleccionado un valor erróneo, vuelva a intentarlo");
			
			break;	
		}

		

			System.out.println("\n----------------------------------------------\nMuchas gracias por utilizar el programa.");
		
		
		
		
		
		
	}

}
