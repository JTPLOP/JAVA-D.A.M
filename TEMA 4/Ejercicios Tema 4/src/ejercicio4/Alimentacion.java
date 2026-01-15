package ejercicio4;

public class Alimentacion extends Producto{

	//ATRIBUTOS
	private int caducida;
	private double descuento;
	public Alimentacion(int id, String nombre, double preciou, int caducida, double descuento) {
		super(id, nombre, preciou);
		this.caducida = caducida;
		this.descuento = descuento;
	}
	public int getCaducida() {
		return caducida;
	}
	public void setCaducida(int caducida) {
		this.caducida = caducida;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	@Override
	public String toString() {
		return "Alimentacion [caducida=" + caducida + ", descuento=" + descuento + "]";
	}
	
	//METODOS
	
	public double calcularPrecio () {
		
		double den =100;	
		
		if (caducida <= 2) {
			return super.calcularPrecio() - (super.calcularPrecio() * descuento /den);
		}else {
			return super.calcularPrecio();
		}
		
		
	}
	
	public void fechaCaducida () {
		System.out.println("El producto "+ getNombre()+ " caducara en " + getCaducida()+ " dias.");
	}
	
}
