package ejercicio3;

public class Coches extends Vehiculo{

	private double potencia;

		

		public Coches(String[] categoria, double potencia) {
		super(categoria);
		this.potencia = potencia;
	}



		public double calcularPrecio (double [] cantidadFija, int tipoVehi) {
		
		int den=100;
		double porcentaje=25;
		double gasto;
		
		gasto = potencia*porcentaje/den;
		
		
		
		
		return gasto+super.calcularPrecio(cantidadFija, tipoVehi);
	}
	
	
}
