package ejemplo3Figura2D;

public class Circulo extends Figura{

	private double radio;
	
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	

	



	@Override //NOS INDICA QUE EL METODO HA SIDO REESCRITO
	public double calcularArea () {
		double exp=2;
		return Math.PI*Math.pow(radio, exp);
	}
}
