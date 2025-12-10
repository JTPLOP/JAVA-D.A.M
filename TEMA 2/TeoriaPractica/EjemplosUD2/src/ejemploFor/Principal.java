package ejemploFor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int profesor;
		System.out.println("Cuantas veces escribo la frase");
		profesor=Leer.datoInt();
		
		for (int i=0;i<profesor;i++) {
			System.out.println((i+1)+" No llegar tarde");
		}
	}

}
