package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		//VARIABLES
		double saldo=0;
		String titular;
		int opcion;
		
		double ingresar,retirar,dolares;
		
		
		AccionesCuenta c1;
		//PROGRAMA
		
		System.out.println("¿Podrías identificar al titular de esta cuenta?\nIndicar aquí:");
		titular=Leer.dato();
		System.out.println("Bienvenido "+titular+", este programa informatico te ayudará con el control de tu cuenta corriente.");
		
		c1= new AccionesCuenta (saldo,titular);
		do {
			
			System.out.println("¿Podrías seleccionar la acción que deseas llevar a cabo?");
			System.out.println("[1] Para ingresar dinero");
			System.out.println("[2] Para retirar dinero");
			System.out.println("[3] Para realizar conversión a dolares");
			System.out.println("[4] Para ver su saldo actual.");
			System.out.println("[0] Para cerrar el programa");
			
			opcion=Leer.datoInt();
			
			switch (opcion) {
			
				case 1: 
					System.out.println("Usted eligio la opcion de agregar dinero a su cuenta corriente.");
					System.out.println("Que cantidad de dinero deseas agregar?\nIndique la cantidad: ");
					ingresar=Leer.datoDouble();
					
					c1.ingresarDinero(ingresar);
					
					System.out.println("El dinero ha sido agregado correctamente!\n");
					break;
					
				case 2: 
					System.out.println("Usted eligio la opcion de retirar dinero de su cuenta corriente.");
					System.out.println("Que cantidad de dinero deseas retirar?\nIndique la cantidad: ");
					retirar=Leer.datoDouble();
					
					if (c1.getSaldo() < retirar) {
						System.out.println("No tienes suficiente cantidad como para retirar el dinero.\n");
						
					}else {
						
						c1.retirarDinero(retirar);
						
						System.out.println("El dinero ha sido retirado correctamente!\n");
					}
					
					break;
					
				case 3: 
					System.out.println("Usted eligio la opcion de realizar conversion a dolares.");
					
					dolares=c1.conversionDolares();
					
					System.out.printf("\nLa conversion de euros a dolares en su cuenta quedaria con un total de: %.2f$.\n\n",dolares);
					
					break;
				case 4: 
					System.out.println("Usted eligio la opcion de ver su saldo actual.\n");
					
					c1.verSaldo();
					break;
					
				case 0: 
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.err.println("El valor introducido es erroneo, vuelve a intentarlo.\n");
					break;
			}
			
		}while (opcion != 0);
		System.out.println("\n---------------------------------------\nMuchas gracias por utilizar el programa.");
		
	}

}
