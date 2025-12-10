package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definir variables
		
		String [] nombres = {"José", "Pablo", "Paco", "Carlos", "Antonio"};
		
		System.out.println("Bienvenido usuario, este programa te mostrará un array que ha sido inicializado con cinco nombres.");
		System.out.println("Lista de nombres:\n----------------------------");
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre "+(i+1)+": "+nombres[i]);
		}
		
		
	}

}
