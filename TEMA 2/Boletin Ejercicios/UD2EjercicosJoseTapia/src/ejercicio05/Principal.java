package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/* Realiza un programa que calcule la potencia de un número, dado este y su exponente sin
		usar Math.pow ( ). Pueden ocurrir tres casos:
		* El exponente sea positivo, imprime resultado en pantalla.
		* El exponente sea 0, el resultado es 1.
		* El exponente sea negativo, el resultado es 1/potencia con el exponente positivo*/
		
		
		// Definir variables
		
		int base, exp, den=0,den2=-1,expPos;
		String usuario;
		double resultado;
		
		System.out.println("Hola, ¿podrías introducir tu nombre?");
		usuario=Leer.dato();
		
		System.out.println("Encantado " +usuario+", este programa se encargará de calcular la potencia de un número. \n¿Podrías introducir un valor para la base?: ");
		base=Leer.datoInt();
		System.out.println("Perfecto, ¿podrías indicar otro valor?, esta vez para el exponente: ");
		exp=Leer.datoInt();

		//Posibilidades
		
		if (exp==den) {
			System.out.println("El resultado es 1.");
		}else { if(exp>0) {
			resultado=Math.pow(base, exp);
			System.out.printf("El resultado es %.1f",resultado);
			
			}else{
				expPos=exp*den2;
				System.out.println("El resultado es 1/"+base+"^"+expPos);
			}
		
		System.out.println("Muchas gracias por utilizar el programa.");
		
		}

	}
}