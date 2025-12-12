package ejercicio3;

public class Coches extends Vehiculo{

	private double potencia;

	public Coches(boolean ceroEmi, boolean eCO, boolean tipoB, boolean tipoC, double potencia) {
		super(ceroEmi, eCO, tipoB, tipoC);
		this.potencia = potencia;
	}
	
		public double calcularPrecio (double impuesto) {
		
		int den=100;
		double porcentaje=25;
		double gasto;
		
		gasto = potencia*porcentaje/den;
		
		
		
		
		return gasto+super.calcularPrecio(impuesto);
	}
	
	
}
