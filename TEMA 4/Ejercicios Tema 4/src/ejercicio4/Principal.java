package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		
		//CREAMOS OBJETOS
		Producto p1 = new Electronica (1, "RAM", 20, 100);
		Producto p2 = new Alimentacion (2, "Arroz", 1, 20, 3);
		Producto p3 = new Alimentacion (3, "Manzana", 23, 30, 3);
		
		LineaDeVenta lv = new LineaDeVenta (p1,4);
		LineaDeVenta lv2 = new LineaDeVenta (p2,7);
		LineaDeVenta lv3 = new LineaDeVenta (p3,14);
		
		LineaDeVenta lista [] = {lv, lv2,lv3};
		
		
		Venta v = new Venta (lista); 
				
		//VARIABLES

		System.out.println("Hola");
		
		
		
		
		
		
		
		
	}
}
