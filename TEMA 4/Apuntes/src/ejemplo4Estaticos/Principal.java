package ejemplo4Estaticos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CREAMOS OBJETOS
		double ganancias=10;
		Producto p1,p2,p3;
		int cantidad;
		//Contador de creacion de objetos
		
		p1 = new Producto ("Pataticas", 2);
		System.out.println(p1);
		p2 = new Producto ("Aguacate", 5);
		System.out.println(p2);
		p3 = new Producto ("Atun",7);
		
		Gestion g;
		g = new Gestion ();
		
		System.out.println("Indica cantidad 1");
		cantidad=Leer.datoInt();
		System.out.println(g.calcularLineaVenta(p1, cantidad, ganancias));
		
		System.out.println("Indica la cantidad 2");
		cantidad=Leer.datoInt();
		System.out.println(g.calcularLineaVenta(p2, cantidad, ganancias));
		
		System.out.println(p1); //AQUI DEMOSTRAMOS AL VER CONTADOR QUE COMPARTEN ENTRE LOS OBJETOS
		System.out.println(p3); //Todos los objetos (p1,p2,p3) tendran el mismo valor de Contador
		System.out.println(p2);
	}

}
