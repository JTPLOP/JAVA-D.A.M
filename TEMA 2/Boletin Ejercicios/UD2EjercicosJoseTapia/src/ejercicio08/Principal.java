package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		String usuaEst="Usuario",contraEst="Contraseña", usuaLeer, contraLeer, nombre;
		
		System.out.println("Hola, ¿podrías decirme cúal es tu nombre? Indicar: ");
		nombre=Leer.dato();
		
		// Pedir datos
		System.out.println("Encantado "+nombre+", por medidas de seguridad necesitamos que introduzca el usuario y contraseña para poder dar inicio al programa.\n¿Podrías indicarme cúal es el nombre de usuario? Indicar: ");
		usuaLeer=Leer.dato();
		
		if (!usuaEst.equals(usuaLeer)) {
			System.err.println("Lo siento "+nombre+", el usuario que has introducido es incorrecto, ¿podrías reintentarlo?");
		}else {
			System.out.println("Perfecto, introduzca ahora la contraseña: ");
			contraLeer=Leer.dato();
		
		if (!contraEst.equals(contraLeer)) {
			System.err.println("Lo siento "+nombre+", la contraseña que has introducido es incorrecta, ¿podrías reintentarlo?");
		}else {
			System.out.println("Bienvenido al programa "+nombre);
		}
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\nMuchas gracias por utilizar el programa.");
		
		}
		
	}

}
