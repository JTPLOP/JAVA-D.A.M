package ejercicio1;

public class Hijo {

	//ATRIBUTO
	private String nombre;
	private int id;
	private int edad;
	private int horasSemanales; //horas estudiadas a la semana
	public Hijo(String nombre, int id, int edad, int horasSemanales) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.horasSemanales = horasSemanales;
	}
	public Hijo() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getHorasSemanales() {
		return horasSemanales;
	}
	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", horasSemanales=" + horasSemanales + "]";
	}
	
	
	//METODO CALCULAR PAGA
	
	public double calcularPaga (double cantidadDinero, double porcentaje) {
		//variables
		double pagaSemanal;
		double porcentajeRestado;
		int den=100;
		
		pagaSemanal=horasSemanales*cantidadDinero;
		porcentajeRestado= pagaSemanal*porcentaje/den;
		return pagaSemanal-=porcentajeRestado;

	}
	
	
	
	
}
