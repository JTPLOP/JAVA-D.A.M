package ejercicio_10;

public class Billete {

	
	//ATRIBUTOS 
	
	private double precio;
	private int numPersonas;
	private int numSaltos;
	
	//AUTOGENERADO 
	public Billete(double precio, int numPersonas, int numSaltos) {
		super();
		this.precio = precio;
		this.numPersonas = numPersonas;
		this.numSaltos = numSaltos;
	}

	public Billete() {
		super();
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	public int getNumSaltos() {
		return numSaltos;
	}

	public void setNumSaltos(int numSaltos) {
		this.numSaltos = numSaltos;
	}

	@Override
	public String toString() {
		return "Billete [precio=" + precio + ", numPersonas=" + numPersonas + ", numSaltos=" + numSaltos + "]";
	}
	
	
	
	
}
