package ejercicio5;

public class Vendedor extends Empleado {

	//AGREGAR ATRIBUTOS
	private double cantVentas;
	private double incentivo; //porcentaje de las ventas realizadas al mes sumado al sueldob
	public Vendedor(String nombre, String apellidos, double sueldoB, int idEmpleado, double cantVentas, double incentivo) {
		super(nombre, apellidos, sueldoB, idEmpleado);
		this.cantVentas = cantVentas;
		this.incentivo = incentivo;
	}
	public double getCantVentas() {
		return cantVentas;
	}
	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}
	public double getIncentivo() {
		return incentivo;
	}
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	@Override
	public String toString() {
		return "Vendedor [cantVentas=" + cantVentas + ", incentivo=" + incentivo + "]";
	}
	
	//METODOS NECESARIOS
	@Override
	public double calcularSueldo ( ) {
		int den=100;
	return getSueldoB() + (getSueldoB()*incentivo/den);
		
	}
	
	
	
	
	
	
	
	
	
}
