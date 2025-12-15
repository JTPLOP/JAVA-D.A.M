package ejemplo3Figura2D;

public abstract class Figura {

	private double x;
	private double y;
	
	
	public Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}




	public abstract double calcularArea (); //METODO ABSTRACTO
	
	
	
}
