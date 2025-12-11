package ejemplo01;

public class Persona {
	
	private String DNI;
	private int edad;
	private String nombre;
	private int codPostal;
	private int numTelefono;
	private int id;
	
	
	public Persona(String dNI, int edad, String nombre, int codPostal, int numTelefono, int id) {
		super();
		this.DNI = dNI;
		this.edad = edad;
		this.nombre = nombre;
		this.codPostal = codPostal;
		this.numTelefono = numTelefono;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", edad=" + edad + ", nombre=" + nombre + ", codPostal=" + codPostal
				+ ", numTelefono=" + numTelefono + ", id=" + id + "]";
	}
	
	
	//METODOS
	public int sumarEdad (int cant) {
		return edad+cant;
	}
	
	
	
	
	
	
	
}

