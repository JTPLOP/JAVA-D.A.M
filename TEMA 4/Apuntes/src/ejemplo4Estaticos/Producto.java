package ejemplo4Estaticos;

public class Producto {

	private String nombre;
	private double precioBase;
	private static int contador; //compartido por objeto prodcutos
	
	
	public Producto(String nombre, double precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		contador++; //agregado manualmente
	
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", Contador="+contador+"]";
	} 
	
	public double calcularProducto (double ganancias) {
		
		return precioBase+ganancias; //METODO 
		//EL Numero magico simula una comision extra de ganancia
	}
	
	
	
	
}
