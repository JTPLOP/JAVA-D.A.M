package ejercicio2;

public class Documento {

	private String marca;

	public Documento(String marca) {
		super();
		this.marca = marca;
	}

	public Documento() {
		super();
	}
	
	//Metodo
	public void crearEncabezado () {
		System.out.println("=============================");
		System.out.println(marca);
		
	}
}
