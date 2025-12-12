package ejercicio2V2;

public class TarjetaDeVisita extends Documento {

	private String correo;
	private String nombre;
	
	
	
	public TarjetaDeVisita(String correo, String nombre) {
		super();
		this.correo = correo;
		this.nombre = nombre;
	}

	public void crearEncabezado (Empresa e1) {
		super.crearEncabezado(e1);
		System.out.println("\t\tNombre: "+nombre);
		System.out.println("\t\tCorreo: "+correo);
		System.out.println("=============================\n");
	}
}
	
	
	

