package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		//Definir variables
		double num1,num2, resultado, den=0;
		String usuario;
		
		System.out.println("Hola, ¿podrías indicarme su nombre?");
		usuario=Leer.dato();
		
		System.out.printf("Bienvenido %s, este programa se encarga de dividir números. \n¿Podrías indicarme cúal es el  valor del denominador ? Indicar: ",usuario );
		num1=Leer.datoDouble();
		System.out.println("Anotado...\n¿Podrías indicar el valor del denominador?");
		num2=Leer.datoDouble();
		
		if (num2==den) {
			System.err.println("Error, no puedes utilizar "+den);
		}else {
			resultado=num1/num2;
			System.out.printf("El resultado de tu operación es %.2f",resultado);
		}
		
		
		
		
	}

}
