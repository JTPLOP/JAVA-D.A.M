package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, den=2;
		double resultado;
		String usuario;
		//preguntar datos
		System.out.println("Hola, ¿podrías introducir su nombre?");
		usuario=Leer.dato();
		System.out.println("Encantado "+usuario+", puedes introducir algún valor para determinar si es par o impar");
		num=Leer.datoInt();
		resultado=num%den;
		
		if (resultado==0) {
			System.out.println("El numero introducido es par.");
		}else {
			System.out.println("El numero introducido es impar.");
		}
		System.out.println("Muchas gracias por utilizar el programa.");
	}

}
