package ejemplo4Estaticos;

public class Gestion {

	private static double caja; //DINERO HECHO TRAS TODAS LAS VENTAS

	public Gestion() {
		super();
		caja=0;
	}
	
	public double calcularLineaVenta (Producto p, int cantidad, double ganancias) {
		double total=0;
		
		total = p.calcularProducto(ganancias)*cantidad;
		caja+=total;
		
		return caja;
		
	}
	
	
}
