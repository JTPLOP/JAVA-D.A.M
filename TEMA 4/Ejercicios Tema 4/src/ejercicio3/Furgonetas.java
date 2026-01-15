package ejercicio3;

public class Furgonetas extends Vehiculo{

	private double cantFija;
	
		public Furgonetas(String[] categoria, double cantFija) {
		super(categoria);
		this.cantFija = cantFija;
	}


		public double calcularPrecio (double [] cantidadFija, int tipoVehi) {
		
		return cantFija+super.calcularPrecio(cantidadFija, tipoVehi);
	}
	
}
