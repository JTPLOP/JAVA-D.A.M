package ejercicio5;

public abstract class Empleado {

	//ATRIBUTOS
	private String nombre;
	private String apellidos;
	private double sueldoB;
	private int idEmpleado;
	
	public Empleado(String nombre, String apellidos, double sueldoB, int idEmpleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoB = sueldoB;
		this.idEmpleado = idEmpleado;
	}

	
	public Empleado() {
		super();
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSueldoB() {
		return sueldoB;
	}

	public void setSueldoB(double sueldoB) {
		this.sueldoB = sueldoB;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoB=" + sueldoB + ", idEmpleado="
				+ idEmpleado + "]";
	}
	
	//METODOS NECESARIOS
	
	public abstract double calcularSueldo ();
	
	
}
