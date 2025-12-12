package ejercicio2;

public class Carta extends Documento {

	private String fecha;

	public Carta(String marca, String fecha) {
		super(marca);
		this.fecha = fecha;
	}
	
	//Metodo
	
	public void crearEncabezado () {
		super.crearEncabezado();
		System.out.println("\t\tFecha: "+fecha);
		System.out.println("=============================\n");
	}
}
