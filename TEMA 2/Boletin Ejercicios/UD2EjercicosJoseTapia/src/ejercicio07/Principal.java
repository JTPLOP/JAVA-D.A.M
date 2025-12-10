package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuario;
		double precioSin, precioP, descuento, precioCon, min=100;
		int cantidadP, den=100;
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("Bienvenido "+usuario+", este programa te ayudará a calcular el precio final de la compra de un solo producto.");
		System.out.println("¿Me podrías indicar el precio del producto?");
		precioP=Leer.datoDouble();
		
		System.out.println("\nAnotando...");
		System.out.println("Bien, ¿me podrías decir la cantidad que lleva del producto?");
		cantidadP=Leer.datoInt();
		
		//calculos generales
		
		precioSin=precioP*cantidadP;
		
		System.out.println("\nCalculando...\n");
		
		if (precioSin > min) { 
			System.out.printf("El pedido sobrepasa el mínimo de los %.2f€, lo que significa que se le aplicará un descuento al precio total (%.2f€).",min,precioSin);
			System.out.println("\n¿Podrías decirme de cuánto se tratará el descuento?");
			descuento=Leer.datoDouble();
			
			precioCon=precioSin-precioSin*descuento/den;
			
			System.out.printf("El precio con el descuento aplicado es de %.2f€.",precioCon);
		}else { 
			System.out.printf("\nAl no sobrepasar el mínimo de los %.2f€, no habrá ningún descuento aplicado a la compra.",min);
			System.out.printf("El precio total es de %.2f€.",precioSin);		
			
		}
		 
		System.out.println("\n-------------------------------\nMuchas gracias por utilizar el programa.");	
		
	}

}
