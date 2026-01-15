package ejercicio4;

public class Producto {

	//ATRIBUtos
	private int id;
	private String nombre;
	private double preciou;
	public Producto(int id, String nombre, double preciou) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.preciou = preciou;
	}
	public Producto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPreciou() {
		return preciou;
	}
	public void setPreciou(double preciou) {
		this.preciou = preciou;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", preciou=" + preciou + "]";
	}
	
	//METODOS
	
	public double calcularPrecio () {
		return preciou;
	}
	
	public void fechaCaducida () {
	}
	
	
	
	
	
	
	
	
}
