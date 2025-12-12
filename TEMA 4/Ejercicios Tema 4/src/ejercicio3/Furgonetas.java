package ejercicio3;

public class Furgonetas extends Vehiculo{

	private double cantFija;

	public Furgonetas(boolean ceroEmi, boolean eCO, boolean tipoB, boolean tipoC, double cantFija) {
		super(ceroEmi, eCO, tipoB, tipoC);
		this.cantFija = cantFija;
	}
	
		public double calcularPrecio (double impuesto) {
		
		return cantFija+super.calcularPrecio(impuesto);
	}
	
}
