package ejemploWhileº;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		
		System.out.println("Podrias introducir un valor");
		num1=Leer.datoInt();
		
		while (num1 < 7) {
			num1=num1+1;
			System.out.println("Se le ha sumado 1 unidad al valor introducido, ahora el valor es "+num1);
		}
		
		System.out.println("\n--------------------\nMuchas gracias su valor ya es apto.");
	}

}
