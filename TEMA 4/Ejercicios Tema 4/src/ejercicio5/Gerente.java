package ejercicio5;

public class Gerente extends Empleado {

	private double impuesto;
	
	
	public Gerente(String nombre, String apellidos, double sueldoB, int idEmpleado, double impuesto) {
		super(nombre, apellidos, sueldoB, idEmpleado);
		this.impuesto = impuesto;
	}
	
	
	public double getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	
	//METODOS

	public double calcularSueldo () {
		int den=100;
		return getSueldoB()-getSueldoB()*impuesto/den;
	}
	
	

}
