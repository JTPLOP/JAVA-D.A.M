package ejercicio2V2;

public class Carta extends Documento {

	private String fecha;	
	public Carta(String fecha) {
		super();
		this.fecha = fecha;
	}
	
	public void crearEncabezado (Empresa e1) {
		super.crearEncabezado(e1);
		System.out.println("\t\tFecha: "+fecha);
		System.out.println("=============================\n");
	}
}
