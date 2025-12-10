package ejercicio03;

public class Operaciones {

	//METODOS
	
	public void polaridad (int valor) {
		
		if (valor < 0) {
			System.out.println("El valor ("+valor+") es negativo.");
		}else {
			System.out.println("El valor ("+valor+") es positivo.");
		}
	}
	
	public void paridad (int valor) {
		
		int den=2;
		double total;
		total=valor%den;
		
		if (total == 0) {
			System.out.println("El valor ("+valor+") es par.");
		}else {
			System.out.println("El valor ("+valor+") es impar.");
		}
		
	}

	
		
	
	
}
