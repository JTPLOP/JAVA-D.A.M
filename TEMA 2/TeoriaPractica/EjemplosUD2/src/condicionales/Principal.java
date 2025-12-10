package condicionales;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad, mayoria=18;
		System.out.println("Hola, vamos a averiguar si eres o no apto. \nIntroduzca su edad: ");
		edad=Leer.datoInt();
		
			if (edad>=mayoria) {
				System.out.println("Usted puede pasar");
			}else {
				System.out.println("Eres menor, no puedes pasar.");
			}
			System.out.println("Gracias por utilizar el programa.");
		}

}
