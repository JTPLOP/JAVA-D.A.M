package ejercicio2;

public class TarjetaDeVisita extends Documento {

	private String correo;
	private String nombre;
	
	public TarjetaDeVisita(String marca, String correo, String nombre) {
		super(marca);
		this.correo = correo;
		this.nombre = nombre;
	}
	
	//metodo
	
	public void crearEncabezado () {
		super.crearEncabezado();
		System.out.println("\t\tContacto: "+correo);
		System.out.println("\t\tNombre: "+nombre);
		System.out.println("=============================\n");
	}
	
	
}
