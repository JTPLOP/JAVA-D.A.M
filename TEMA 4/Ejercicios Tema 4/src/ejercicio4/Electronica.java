package ejercicio4;

public class Electronica extends Producto {

	//ATRIBUTOS
	
	private double impEspecial;
	
	
	public Electronica(int id, String nombre, double preciou, double impEspecial) {
		super(id, nombre, preciou);
		this.impEspecial = impEspecial;
	}

	@Override
	public String toString() {
		return "Electronica [impEspecial=" + impEspecial + "]";
	}

	public double getImpEspecial() {
		return impEspecial;
	}

	public void setImpEspecial(double impEspecial) {
		this.impEspecial = impEspecial;
	}
	
	//METODOS
	
	public double calcularPrecio () {
		return super.calcularPrecio() + impEspecial;
	}
		
	
}

