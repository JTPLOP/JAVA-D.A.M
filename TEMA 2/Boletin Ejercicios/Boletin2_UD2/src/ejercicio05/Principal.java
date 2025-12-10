package ejercicio05;

import utilidades.Leer;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar variables
		
		String usuario;
		int [] valores;
		int tam;
		int desde,hasta, suma=0, mayor, menor, eleccion, valor;
		double media;
		
		System.out.println("¿Podrías introducir tu nombre? Indicar: ");
		usuario=Leer.dato();
		
		System.out.println("Bienvenido "+usuario+", le va a guardar una cantidad de datos que usted desee.");
		System.out.println("-------------------------------\n¿Podrías decirme cuántos valores vas a querer guardar?\nIndicar: ");
		tam=Leer.datoInt();
		
		System.out.println("Introduzca el minimo valor que va a comprender el aleatorio: ");
		desde=Leer.datoInt();
		
		System.out.println("Introduzca el máximo valor que va a comprender el aleatorio");
		hasta=Leer.datoInt();
		
		System.out.println("\nAnotando...");
		System.out.println("Han salido los siguientes números aleatorios: \n----------------------------");
		
		Random r= new Random (System.nanoTime());
		
		valores= new int [tam];
		
		//aleatorios
		for (int i = 0; i < valores.length; i++) {
			valores[i]=r.nextInt(hasta-desde+1)+desde;
			
			System.out.println((i+1)+" Número: "+valores[i]+"\n----------------------------");

		}
		
		//suma
		for (int i = 0; i < valores.length; i++) {
			suma+=valores[i];
		}
		
		System.out.println("\nBien, en cuánto a la suma de los "+valores.length+" números generados:\n----------------------------\nEl resultado es: "+suma+"\n----------------------------");
		
		// Mayor y menor
		
		mayor=valores[0];
		menor=valores[0];
		
		for (int i = 1; i < valores.length; i++) {
			
		if (valores[i] < menor) {
			
			menor=valores[i];
		
		}else { if (valores[i] > mayor) {
			
				mayor=valores[i];
			
				}
			
			}
		
		}
		
		System.out.println("\nTras unas operaciones hemos llegado a la siguiente conclusión: ");
		System.out.println("----------------------------\nEl mayor valor es : "+mayor+"\n----------------------------");
		System.out.println("----------------------------\nEl menor valor es : "+menor+"\n----------------------------");
		
		System.out.println(usuario+" ahora necesitamos que modifique uno de los espacios, ¿cuál deseas modificar?\nIndicar:"); //mostrar lista al usuario para que pueda elegir cambiar, hay que ser consciente de que el usuario no se acuerda del valor en cada posicion.
		eleccion=Leer.datoInt()-1;
		
		System.out.println("Bien, ahora que has seleccionado el "+(eleccion+1)+" espacio necesitamos que nos indiques que valor vas a introducir: ");
		valor=Leer.datoInt();
		
		System.out.println("Hemos modificado el "+(1+eleccion)+" espacio, en el se encontraba el valor "+valores[eleccion]+", sin embargo acaba de ser actualizado al valor: ");
		valores[eleccion]=valor;
		System.out.printf("%d.",valores[eleccion]);
		
		//MEDIA
		media=(double)suma/valores.length;
		
		System.out.printf("\n----------------------------\nEl resultado de la media es: %.2f\n----------------------------",media);
		
		System.out.println("\n---------------------------------\nMuchas gracias por utilizar el programa.");
		
		
		
		
		
		
	}
}
