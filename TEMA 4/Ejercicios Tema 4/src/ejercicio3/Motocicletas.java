package ejercicio3;

public class Motocicletas extends Vehiculo{

	private double cilindrada;

	public Motocicletas(boolean ceroEmi, boolean eCO, boolean tipoB, boolean tipoC, double cilindrada) {
		super(ceroEmi, eCO, tipoB, tipoC);
		this.cilindrada = cilindrada;
	}
	
	public double calcularPrecio (double impuesto) {
		
		int den=100;
		double porcentaje=60;
		double gasto;
		
		gasto = cilindrada*porcentaje/den;
		
		
		
		
		return gasto+super.calcularPrecio(impuesto);
	}
	
}
