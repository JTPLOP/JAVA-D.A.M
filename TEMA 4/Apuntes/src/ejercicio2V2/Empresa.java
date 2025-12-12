package ejercicio2V2;

public class Empresa {

	private String nombre;
	private String cIF;
	public Empresa(String nombre, String cIF) {
		super();
		this.nombre = nombre;
		this.cIF = cIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getcIF() {
		return cIF;
	}
	public void setcIF(String cIF) {
		this.cIF = cIF;
	}
	
	
	
}
