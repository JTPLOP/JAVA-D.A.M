package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuario;
		double nota1,nota2,nota3, notaSuma, media, aprobado=5;
		int den=3;
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("Bienvenido "+usuario+", la función de este programa es calcular tu media y darte una conclusión sobre si vas a estar aprobado o suspenso.");
		System.out.println("¿Podrías darme tu primera nota?");
		nota1=Leer.datoDouble();
		
		System.out.println("Anotando...");
		System.out.println("Bien, ¿podrías darme tu segunda nota?");
		nota2=Leer.datoDouble();
		
		System.out.println("Anotando...");
		System.out.println("Ya esta casí, ¿podrías darme tu tercera nota?");
		nota3=Leer.datoDouble();
		
		notaSuma=nota1+nota2+nota3;
		media=notaSuma/den;
	
		System.out.println("\nCalculando...");
		
		if (media >= aprobado) {
			System.out.printf("\nTu media es de %.2f, como resultado has aprobado.",media);
			System.out.println("\n¡Felicidades!");
		}else {
			System.out.printf("\nTu media es de %.2f, como resultado has suspendido.",media);
			System.out.println("\nLo sentimos mucho, suerte con la recuperación.");
		}
		
		System.out.println("\n---------------------------------------\nMuchas gracias por utilizar el programa.");
	}

}
