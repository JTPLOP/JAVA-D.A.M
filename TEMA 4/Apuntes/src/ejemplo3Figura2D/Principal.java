package ejemplo3Figura2D;

public class Principal {

	public static void main(String[] args) {

		Circulo f1 = new Circulo (2,1,4);
		
		Cuadrado c1 = new Cuadrado (4,5,6);
		System.out.println(f1.toString());
		
		System.out.println(f1.calcularArea());
		System.out.println(c1.calcularArea());
	}

}
