package ejercicio3;

public class Vehiculo {
 
	private String categoria []; 

	public Vehiculo(String[] categoria) {
		super();
		this.categoria = categoria;
	}

	
	public Vehiculo() {
		super();
	}
	


	public String[] getCategoria() {
		return categoria;
	}


	public void setCategoria(String[] categoria) {
		this.categoria = categoria;
	}


	//METODOS
	public double calcularPrecio (double [] cantidadFija, int tipoVehi) {
	//VARIABLES
		
		return cantidadFija[tipoVehi];
	}
	
	public void mostrarTipos () {
		
		for (int i = 0; i < categoria.length; i++) {
			System.out.printf("\n"+(i+1)+": "+getCategoria()[i]);
		}
		
		
	}
	
}
