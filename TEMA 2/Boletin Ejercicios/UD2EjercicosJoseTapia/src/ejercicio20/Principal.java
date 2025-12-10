package ejercicio20;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuario;
		int opcionU, entradas, cantidad;
		double retirar, ingresar,saldoF, precios, saldo=2000;
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("\nBienvenido "+usuario+". Este programa es la interfaz de un cajero automático.");
		
		do { 
			System.out.println("\n¿Me podrías indicar que opcíon quieres llevar a cabo?");
			System.out.println("Pulse 0 para salir del cajero automatico.\nPulse 1 para ver saldo.\nPulse 2 para retirar dinero.\nPulse 3 para comprar entradas.\nPulse 4 para ingresar dinero.");
			opcionU=Leer.datoInt();
			
			switch (opcionU) { 
			
			case 1: 
				
				System.out.printf("Actualmente dispones de %.2f€ en tu cuenta del banco.",saldo);
				System.out.println("\n--------------------------------------------------------");
				break; 
			
			case 2: 
				System.out.println("\n¿Cuánto es la cantidad monetaría que deseas retirar?\nIndicar: ");
				retirar=Leer.datoDouble();
				
				if (saldo < retirar) {
					System.out.println("No se puede retirar más dinero que el presente de la cuenta. Vuelva a intentarlo.");
				}else {
					saldo=saldo-retirar;
					System.out.printf("\nSe han retirado %.2f€ de la cuenta, el estado actual de la cuenta es de %.2f€.",retirar,saldo);
				}
				break;
			
			case 3: 
				System.out.println("\n¿Podrías indicarme que entrada le interesa?");
				System.out.println("Pulse 1 para Teatro\nPulse 2 para Cine\nPulse 3 para partido de futbol");
				entradas=Leer.datoInt();
				
				if (saldo <=0) { 
					System.out.println("No tienes dinero suficiente en la cuenta.");
				}else {
				
				switch (entradas) { 
			
					case 1: 
						System.out.println("¿Cuántas entradas para el teatro deseas comprar?");
						cantidad=Leer.datoInt();
						
						System.out.println("\nAnotando...");
						System.out.println("¿Cuál es el precio de las entradas?");
						precios=Leer.datoDouble();
						
						saldo=saldo-cantidad*precios;
						
						if (saldo < entradas) {
							System.out.println("No se puede hacer la compra, ya que su precio supera tu saldo actual.");
						}else {
												
							System.out.println("\nYa se han adquirido las entradas.");
							
						}
						break;
					case 2: 
						System.out.println("¿Cuántas entradas para el cine deseas comprar?");
						cantidad=Leer.datoInt();
						
						System.out.println("Anotando...");
						System.out.println("¿Cuál es el precio de las entradas?");
						precios=Leer.datoDouble();
						saldo=saldo-cantidad*precios;
						
						
						if (saldo < entradas) {
							System.out.println("No se puede hacer la compra, ya que su precio supera tu saldo actual.");
						}else {
							System.out.println("\nYa se han adquirido las entradas.");
						}
						break;
					case 3: 
						System.out.println("¿Cuántas entradas para el partido de fútbol deseas comprar?");
						cantidad=Leer.datoInt();
						
						System.out.println("Anotando...");
						System.out.println("¿Cuál es el precio de las entradas?");
						precios=Leer.datoDouble();
						saldo=saldo-cantidad*precios;
						
						if (saldo < entradas) {
							System.out.println("No se puede hacer la compra, ya que su precio supera tu saldo actual.");
						}else {
							System.out.println("\nYa se han adquirido las entradas.");
						}
						break;
						
					default: 
						System.out.println("Has introducido un valor erróneo, vuelva a intentarlo. \n");
				}
				}
				break;
				
			case 4: 
				System.out.println("\n¿Cuánto es la cantidad monetaría que deseas ingresar?\nIndicar: ");
				ingresar=Leer.datoDouble();
				
					saldoF=saldo+ingresar;
					System.out.printf("\nSe han agregado %.2f€ a la cuenta, el estado actual de la cuenta es de %.2f€.",ingresar,saldoF);
					System.out.println("\n--------------------------------------------------------");
					break;
					
			case 0: 
				System.out.println("El programa se ha dado por concluido.");
				break;
					
			default: 
				System.out.println("Has introducido un valor erróneo, vuelva a intentarlo. \n");
				
				}
				
		
		}while (opcionU != 0);
		
		System.out.println("\n------------------------------------------\nMuchas gracias por utilizar el programa.");
	}

}
