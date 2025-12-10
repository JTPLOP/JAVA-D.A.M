package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Definir variables
		int altura,den=2;
		String usuario;
		double peso, imc;
		
		
		// Leer datos
		System.out.println("Introduzca su nombre: ");
		usuario=Leer.dato();
		
		System.out.println("Encantado "+usuario+", este programa se encargará de calcularte el índice de masa corporal (IMC) y explicarte en qué estado se encuentra dependiendo del resultado.");
		System.out.println("¿Podrías introducirme tu peso (utilizando Kg como sistema de referencia)");
		peso=Leer.datoDouble();
		System.out.println("Bien, ¿podrías introducirme ahora tu altura (utilizando cm como sistema de referencia)");
		altura=Leer.datoInt();
		
		// Calculos
		
		imc=Math.pow(altura, den)*peso;
		
		System.out.println("\nCalculando...");
		
		//Posibles casos
		if (imc <16) {
				System.out.printf("Su IMC es de %.0f.\nSu diagnóstico es que es criterio de ingreso en hospital.",imc);
				}else {if (imc <= 17) { 
					System.out.printf("Su IMC es de %.0f.\nSu diagnóstico es que padeces infrapeso.",imc);
				}else {if (imc <=18) { 
					System.out.printf("Su IMC es de %.0f.\nSu diagnóstico es que padeces de bajo peso.",imc);
				}else { if (imc <=25) { 
					System.out.printf("Su IMC es de %.0f.\nSu diagnóstico es que estas saludable.",imc);
				}else {if (imc <=30) {
					System.out.printf("Su IMC es de %.0f.\nSu diagnóstico es que padeces obesidad de grado I.",imc);
				}else {if (imc <=35) {
					System.out.printf("Su IMC es de %.0f.\nSu diagnóstico es que padeces obesidad de grado II.",imc);
				}else {if (imc <=40) {
					System.out.printf("Su IMC es de %.0f.\nSu diagnóstico es que padeces obesidad de grado III.",imc);
				}else {if (imc <=45) { 
					System.out.printf("Su IMC es de %.0f.\nSu diagnóstico es que padeces obesidad de grado IV.",imc);
				}
				}
				}
				}
				}
				}
				}
				}
				


		System.out.println("\nMuchas gracias por utilizar el programa.");
		
				
	}
}