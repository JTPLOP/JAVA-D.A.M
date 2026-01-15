package ejercicio3;

public class Motocicletas extends Vehiculo{

	private double cilindrada;

	public Motocicletas(String[] categoria, double cilindrada) {
		super(categoria);
		this.cilindrada = cilindrada;
	}



	public double calcularPrecio (double[] cantidadFija, int tipoVehi) {
		
		int den=100;
		double porcentaje=60;
		double gasto;
		
		gasto = cilindrada*porcentaje/den;
		
		return gasto+super.calcularPrecio(cantidadFija, tipoVehi);
	}
	
}
