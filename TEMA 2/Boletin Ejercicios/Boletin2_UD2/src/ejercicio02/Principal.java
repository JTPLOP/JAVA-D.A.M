package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar variables
		double [] valores;
		int tam=10, den=2;
		valores = new double [tam];
		double valorUs;
		
		System.out.println("Bienvenido usuario, este programa contendra el resultado de multiplicar por dos el número que escribas. ");
		
		System.out.println("¿Podría indicarnos algún valor?\nIndicar: ");
		valorUs=Leer.datoDouble();
		
		for (int i = 0; i < valores.length; i++) {
			
			valorUs= (double) valorUs*den;
			valores [i]= valorUs;
		}
		
		for (int i = 0; i < valores.length; i++) {
			
			System.out.printf("\nEl valor %d: %.2f",(i+1),valores[i]); //Preguntar como leer orden como usuario %d
		}
		
	}

}
