package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definir variables
		
		double saldoC=10000, saldoR; //preguntar si hay que preguntar por el saldo de la cuenta o definirlo por uno mismo
		String usuario;
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("Bienvenido "+usuario+", este programa te ayudara a saber si te es posible o no retirar el dinero deseado.");
		System.out.println("¿Podrías decirme cuánto deseas retirar? Indicar: ");
		saldoR=Leer.datoDouble();
		
		if (saldoR <= saldoC) {
			System.out.printf("\nSi es posible retirar el dinero seleccionado (%.2f€).",saldoR);
		}else {
			System.out.printf("\nNo es posible retirar el dinero, esto se debe a que el valor indicado (%.2f€) es superior al saldo actual de la cuenta (%.2f€).",saldoR,saldoC);
		}
		
		System.out.println("\n------------------------------------------------------\nMuchas gracias por utilizar el programa.");
	}

}
