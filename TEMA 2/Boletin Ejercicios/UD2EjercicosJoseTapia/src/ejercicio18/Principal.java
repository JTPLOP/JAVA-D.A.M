package ejercicio18;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuario;
		int opcionU, horas, minHoras=40,horasEx, pagoMin=16, pagoEx=20, dineroMin, dineroEx, total;
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("\nBienvenido "+usuario+". Este programa te ayudará a calcular el salario semanal de un obrero.");
		
		do { 
			System.out.println("\n¿Me podrías indicar que opcíon quieres llevar a cabo?");
			System.out.println("Pulse 1 para gestionar el salario de un nuevo obrero.\nPulse 2 para dar por finalizado la gestión.");
			opcionU=Leer.datoInt();
			
			switch (opcionU) { 
				case 1: 
					System.out.println("¿Me podrías decir el número de horas que ha trabajado ese obrero durante la semana?");
					horas=Leer.datoInt();
					
						if (horas > minHoras) {
							
							horasEx=horas-minHoras;
							
							//calculos
							dineroMin=minHoras*pagoMin;
							dineroEx=horasEx*pagoEx;
							
							total=dineroMin+dineroEx;
							
							System.out.println("\nEl obrero deberá de cobrar "+dineroMin+"€ por las "+minHoras+" horas base, y por otro lado cobrará "+dineroEx+"€ por las "+horasEx+" horas extras.");
							System.out.println("En total el obrero deberá recibir "+total+"€.");
							
						}else {
							total=horas*pagoMin;
							System.out.println("En total, el obrero deberá recibir "+total+"€.\nDado que no ha superado las horas mínimas no recibira ninguna bonificación en su sueldo.");
						}
					break;
					
				case 2: 
					System.out.println("El programa se ha dado por concluido.");
					break;
				default:
					System.out.println("Has introducido un valor erróneo, vuelva a intentarlo. \n");
						
			}
			
		}while (opcionU !=2);
		
		System.out.println("\n------------------------------------------\nMuchas gracias por utilizar el programa.");
		
	}

}
