package ejemploNumerosAleatorios;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hasta, desde, ejemploAleatorio,veces;
		int [] aleatorios;
		
		System.out.println("Esto es un ejemplo de como crear aleatorios\n");
		System.out.println("Introduzca el minimo valor que va a comprender el aleatorio:");
		desde=Leer.datoInt();
		
		System.out.println("\nIntroduzca el maximo valor que va a comprender el aleatorio: ");
		hasta=Leer.datoInt();
		Random r= new Random (System.nanoTime());
		
		System.out.println("Cuantos aleatorios vas a querer crear: ");
		veces=Leer.datoInt();
		aleatorios=new int [veces];
		
		for (int i=0; i< aleatorios.length; i++) {
			ejemploAleatorio=r.nextInt(hasta-desde+1)+desde;
			aleatorios[i]=ejemploAleatorio;
			
		}
		
		for (int i = 0; i < aleatorios.length; i++) {
			System.out.println("El "+(i+1)+" número aleatorio generado ha sido: "+aleatorios[i]);
		}
	}

}
