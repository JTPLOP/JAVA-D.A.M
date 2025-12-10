package ejercicio14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuario;
		int mes, enero=31, febrero=28, marzo=31, abril=30, mayo=31, junio=30, julio=31, agosto=31, septiembre=30, octubre=31, noviembre=30, diciembre=31, opcionBis;
		
		System.out.println("¿Podrías decirme tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("\nBienvenido "+usuario+". Este programa se encarga de hallarte cuántos días tienen los diferentes meses del año.");
		System.out.println("¿Podrías indicarme cúal es el mes que te interesa?");
		System.out.println("\nPulse 1 para Enero\nPulse 2 para Febrero\nPulse 3 para Marzo\nPulse 4 para Abril\nPulse 5 para Mayo\nPulse 6 para Junio\nPulse 7 para Julio\nPulse 8 para Agosto\nPulse 9 para Septiembre\nPulse 10 para Octubre\nPulse 11 para Noviembre\nPulse 12 para Diciembre");
		mes=Leer.datoInt();
		
		switch (mes) {
			case 1: 
				System.out.println("El mes que has seleccionado (Enero) tiene "+enero+" días.");
				break;
			case 2: 
				System.out.println("Antes de mostrarte los días que tiene, ¿podrías decirme que opción prefieres?: \nPulse 1 para mostrar en un año normal.\nPulse 2 para mostrar en un año bisiesto.");
				opcionBis=Leer.datoInt();
				
				switch (opcionBis) {
					case 1: 
						System.out.println("El mes que has seleccionado (Febrero en un año normal) tiene "+febrero+" días.");
						break;
					case 2: 
						System.out.println("El mes que has seleccionado (Febrero en un año bisiesto) tiene "+(febrero+1)+" días.");
						break;
					default:
						System.out.println("El valor que has introducido es incorrecto.");
				}
				break;
			case 3: 
				System.out.println("El mes que has seleccionado (Marzo) tiene "+marzo+" días.");
				break;
			case 4: 
				System.out.println("El mes que has seleccionado (Abril) tiene "+abril+" días.");
				break;
			case 5: 
				System.out.println("El mes que has seleccionado (Mayo) tiene "+mayo+" días.");
				break;
			case 6: 
				System.out.println("El mes que has seleccionado (Junio) tiene "+junio+" días.");
				break;
			case 7: 
				System.out.println("El mes que has seleccionado (Julio) tiene "+julio+" días.");
				break;
			case 8: 
				System.out.println("El mes que has seleccionado (Agosto) tiene "+agosto+" días.");
				break;
			case 9: 
				System.out.println("El mes que has seleccionado (Septiembre) tiene "+septiembre+" días.");
				break;
			case 10: 
				System.out.println("El mes que has seleccionado (Octubre) tiene "+octubre+" días.");
				break;
			case 11: 
				System.out.println("El mes que has seleccionado (Noviembre) tiene "+noviembre+" días.");
				break;
			case 12: 
				System.out.println("El mes que has seleccionado (Diciembre) tiene "+diciembre+" días.");
				break;
			default:
				System.out.println("El valor que has introducido es incorrecto.");
		}
		
		System.out.println("\n---------------------------------------------\nMuchas gracias por utilizar el programa.");
		
		
	}

}
