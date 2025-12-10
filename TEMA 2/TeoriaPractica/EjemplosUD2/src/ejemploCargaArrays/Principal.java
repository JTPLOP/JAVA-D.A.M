package ejemploCargaArrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] valor;
		int tam; //no usar nunca la ñ para declarar variables.
		
		System.out.println("Cuantos valores vamos a tener? Indicar: ");
		tam=Leer.datoInt();
		
		valor= new int [tam];
		
		for (int i=0; i<valor.length;i++) {
			System.out.println("Diga un numero");
			valor[i]=Leer.datoInt();
			//la variable dentro del array que debemos leer debera ser la misma que la del bucle.
			
		}
		
		for (int i=0; i<valor.length;i++) {
			
			System.out.println("Valor ("+(1+i)+") = "+valor [i]);
		}
		
		
		
	}

}
