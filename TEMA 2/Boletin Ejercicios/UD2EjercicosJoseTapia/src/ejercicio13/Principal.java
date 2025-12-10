package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia;
		
		System.out.println("Este programa te dirá en que día de la semana se encuentra.");
		System.out.println("\nPresione el número del día en el que se encuentra: ");
		System.out.println("'1' para Lunes\n'2' para Martes\n'3' para Miércoles\n'4' para Jueves\n'5' para Viernes\n'6' para Sábado\n'7' para Domingo");
		dia=Leer.datoInt();
		
		switch (dia) {
		
		case 1: 
			System.out.println("\n ¡Hoy es Lunes!");
			break;
		case 2: 
			System.out.println("\n ¡Hoy es Martes!");
			break;
		case 3: 
			System.out.println("\n ¡Hoy es Miércoles!");
			break;
		case 4: 
			System.out.println("\n ¡Hoy es Jueves!");
			break;
		case 5: 
			System.out.println("\n ¡Hoy es Viernes!");
			break;
		case 6: 
			System.out.println("\n ¡Hoy es Sábado!");
			break;
		case 7: 
			System.out.println("\n ¡Hoy es Domingo!");
			break;
			
		default:
			System.err.println("Usted ha presionado un valor incorrecto.");
		}
		System.out.println("\n-----------------------------");
		System.out.println("Muchas gracias por utilizar el programa.");
	}

}
